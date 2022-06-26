package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;

        System.out.println(media.apply(8.0, 6.2));

        BiFunction<Double, Double, String> resultado = (n1, n2) -> media.apply(n1, n2) >= 7 ? "Aprovado" : "Reprovado";

        System.out.println("Média: "+media.apply(8.0, 6.2) + " Resultado: " + resultado.apply(8.0, 6.2));

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(conceito.apply(media.apply(8.4, 7.0)));

        System.out.println(media.andThen(conceito).apply(8.4, 5.0));
    }
}
