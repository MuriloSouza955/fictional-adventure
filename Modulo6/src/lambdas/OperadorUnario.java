package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> quadrado = n -> n * n;

        //andThen (execute depois)
        System.out.println(maisDois.
                andThen(vezesDois).
                andThen(quadrado).
                apply(0));
        //compose (execute antes)
        System.out.println(quadrado.
                compose(vezesDois).
                compose(maisDois).
                apply(0));
    }
}
