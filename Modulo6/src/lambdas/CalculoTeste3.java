package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        BinaryOperator<Double> calculo = (x, y) -> {
            return x + y;
        };

        System.out.println(calculo.apply(2.0, 3.0));

        calculo = (a, b) -> a * b;
        System.out.println(calculo.apply(2.0, 3.0));

        BinaryOperator<Integer> calc2 = (x, y) -> {
            return x + y;
        };
        System.out.println(calc2.apply(2, 5));

        BinaryOperator<Integer> calc3 = (x, y) -> {
            return x * y;
        };
        System.out.println(calc3.apply(2, 5));
    }
}
