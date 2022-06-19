package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {

        Cliente c1= new Cliente("Pedro");

        Compra cp1 = new Compra();
        Compra cp2 = new Compra();

        Produto p1 = new Produto("Feijão", 5.6);
        Produto p2 = new Produto("Arroz", 8.65);
        Produto p3 = new Produto("Carne", 23.5);
        Produto p4 = new Produto("Salada", 2.5);

        cp1.adicionarItens("Caneta", 9.67, 100);
        cp1.adicionarItens(new Produto("Notebook", 1897.88), 2);
        cp2.adicionarItens(p1, 2);
        cp2.adicionarItens(p2, 1);
        cp2.adicionarItens(p3, 1);
        cp2.adicionarItens(p4, 6);

        c1.adicionarCompra(cp1);
        c1.adicionarCompra(cp2);

        System.out.println(c1.obterValorTotal());
    }
}
