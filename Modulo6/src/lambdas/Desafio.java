package lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

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
        Function<Double, String> arredondar =
                preco -> String.format("%.2f", preco);
        Function<String, String> precoFinalFormatado =
                preco -> ("R$" + preco).replace(".", ",");

        Produto p = new Produto("Ipad", 3235.89, 0.13);

        String preco = precoFinal.
                andThen(impostoMunicipal).
                andThen(frete).
                andThen(arredondar).
                andThen(precoFinalFormatado).
                apply(p);

        System.out.println("O preço final é: " + preco);

    }
}
