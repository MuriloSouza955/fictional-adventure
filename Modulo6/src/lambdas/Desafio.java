package lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import static java.lang.Double.parseDouble;

public class Desafio {
    public static void main(String[] args) {


        /*
         * 1. A partir do produto calcular o preço real(com desconto)
         * 2. Imposto Municipal: >= 2500(8.5%) / < 2500(isento)
         * 3. Frete: >= 3000(1200)/ < 3000 (50)
         * 4. Arredondar: deixar duas casas decimais
         * 5. Formatar R$1234,56
         */

        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar =
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> precoFinalFormatado =
                preco -> ("R$" + preco).replace(".", ",");

        Produto p = new Produto("Ipad", 3235.89, 0.13);

        String preco = precoFinal.
                andThen(impostoMunicipal).
                andThen(frete).
                andThen(arredondar).
                andThen(precoFinalFormatado).
                apply(p);

        System.out.println("O preço final é: " + preco);










/*
        //1. A partir do produto calcular o preço real(com desconto)
        UnaryOperator<Double> preco = n -> p.preco * (1 - p.desconto);
        double precoFinal = (preco.apply(p.preco));

        //2. Imposto Municipal: >= 2500(8.5%) / < 2500(isento)
        Function<Double, Double> impostoMunicipal = imposto -> p.preco >= 2500 ? p.preco * 0.085 : p.preco;
        System.out.println(impostoMunicipal.apply(p.preco));
        //3. Frete: >= 3000(100)/ < 3000 (50)
        Function<Double, Integer> frete = temfrete -> p.preco >= 3000 ? 100 : 50;
//        double frete = 50;
//        if (p.preco >= 3000) {
//            frete = 100;
//        }
        System.out.println(frete.apply(p.preco));

        //4. Arredondar: deixar duas casas decimais DecimalFormat("#,##0.00").format(valor)
        System.out.println(new DecimalFormat("#, ##0.00").format(preco.apply(p.preco)));

 */
    }
}
