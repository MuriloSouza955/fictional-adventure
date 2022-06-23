package lambdas;
// Função lambda, também cohecido como arrow function (função de seta),
// um dos recursos da programação funcional
public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo calculo = (x, y) -> {
            return x + y;
        };

        System.out.println(calculo.executar(2, 3));

        calculo = (a, b) -> a * b;
        System.out.println(calculo.executar(2, 3));

        System.out.println(calculo.legal());
        System.out.println(Calculo.muitoLegal());
    }
}
