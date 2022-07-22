package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num>99 && num < 1000;

//        System.out.println(isPar.test(23));\
//        System.out.println(isTresDigitos.test(999));
        System.out.println("32 ? par ou tem tr?s digitos? negado");
        System.out.println(isPar.or(isTresDigitos).negate().test(32));
        System.out.println("32 ? par ou tem tr?s digitos?");
        System.out.println(isPar.or(isTresDigitos).test(32));
    }
}
