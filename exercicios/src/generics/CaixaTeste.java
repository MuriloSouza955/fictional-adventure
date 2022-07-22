package generics;

public class CaixaTeste {
    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();

        caixaA.guardar("Segredo");
        System.out.println(caixaA.abrir());

        Caixa<Double> caixaB = new Caixa<>();

        caixaB.guardar(3.1415);
        System.out.println(caixaB.abrir());
    }
}
