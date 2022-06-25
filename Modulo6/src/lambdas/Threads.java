package lambdas;

public class Threads {
    public static void main(String[] args) {
        Runnable trabalho1 = new Trabalho1();
        // Classe anonima
        Runnable trabalho2 = () -> {
            for(int i=0; i<100; i++){
                System.out.println("Trabalho #02");
                try {
                    Thread.sleep(10);
                }catch (Exception ignored){}

            }
        };

        Runnable trabalho3 = Threads::trab;

        Thread t1 = new Thread(trabalho1);
        Thread t2 = new Thread(trabalho2);
        Thread t3 = new Thread(trabalho3);

        t1.start();
        t2.start();
        t3.start();
    }

    private static void trab (){
        for(int i=0; i<100; i++){
            System.out.println("Trabalho #3");
            try {
                Thread.sleep(10);
            }catch (Exception ignored){}
        }
    }
}
