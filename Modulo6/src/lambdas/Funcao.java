package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

        Function<String, String> empolgado = valor -> valor + "!!!";

        Function<String, String> duvida = valor -> valor + "???";

        String resulodoFinal1 = parImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

        String resulodoFinal2 = parImpar.andThen(oResultadoE).andThen(duvida).apply(33);

        System.out.println(resulodoFinal1);

        System.out.println(resulodoFinal2);
    }
}
