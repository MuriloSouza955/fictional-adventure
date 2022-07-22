package lambdas;

public class Trabalho1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println("Tarefa #01");
            try {
                Thread.sleep(10);
            }catch (Exception e){}
        }
    }
}
