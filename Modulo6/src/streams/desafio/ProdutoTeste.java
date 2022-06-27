package streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ProdutoTeste {

    Produto p1 = new Produto("Caneta", 7.5, false);
    Produto p2 = new Produto("Lapis", 8.0, false);
    Produto p3 = new Produto("Borracha", 12.8, true);
    Produto p4 = new Produto("Mouse", 120, true);
    Produto p5 = new Produto("Teclado",230 , true);

    List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

    Predicate<Produto> freteGratis = p -> p1.freteGratis;
    Predicate<Produto> valorBaixo = p -> p.preco <=20;

}
