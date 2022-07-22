package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {

        try {
            geraErro1();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fim!!!");

    }
//  Excessão não checada ou nao verificada
    static void geraErro1(){
        throw new RuntimeException("Ocorreu um erro #01!!");
    }
// Excessão checada ou verificada
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro #02!!");
    }
}
