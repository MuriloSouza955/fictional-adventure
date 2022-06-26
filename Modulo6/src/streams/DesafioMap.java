package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
/*
 * 1. Número para String Binária      b=Integer.toBinaryString(x)
 * 2. Inverter a String
 * 3. Converter de volta para inteiro
 */


public class DesafioMap {
    public static void main(String[] args) {

        UnaryOperator<String> inverter =
                s -> new StringBuilder(s).reverse().toString();

        Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioParaInt)
                .forEach(System.out::println);
    }
}
