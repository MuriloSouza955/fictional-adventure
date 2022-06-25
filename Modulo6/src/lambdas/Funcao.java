package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        Function<String, String> oResultadoE = valor -> "O resultado é: " + parImpar.apply(2);

//        System.out.println(parImpar.apply(32));
//        System.out.println(parImpar.apply(5));

        Function<String, String> empolgado = valor -> valor + "!!!";

        String resulodoFinal = parImpar.
                andThen(oResultadoE).
                andThen(empolgado).
                apply(32);

        System.out.println(resulodoFinal);
    }
}
