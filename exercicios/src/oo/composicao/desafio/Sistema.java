package oo.composicao.desafio;
public class Sistema {
    public static void main(String[] args) {

        Cliente c1= new Cliente("Pedro");

        Compra cp1 = new Compra();
        Compra cp2 = new Compra();

        Produto p1 = new Produto("Feijão", 6);
        Produto p2 = new Produto("Arroz", 10);
        Produto p3 = new Produto("Carne", 25);
        Produto p4 = new Produto("Salada", 2);

        cp1.adicionarItens("Caneta", 10, 100);
        cp1.adicionarItens(new Produto("Notebook", 2000), 2);
        cp2.adicionarItens(p1, 2);
        cp2.adicionarItens(p2, 1);
        cp2.adicionarItens(p3, 1);
        cp2.adicionarItens(p4, 6);

        c1.adicionarCompra(cp1);
        c1.adicionarCompra(cp2);

        System.out.println(cp1.obterValorTotal());
        System.out.println(cp2.obterValorTotal());
        System.out.println("Total das compras: "+c1.obterValorTotal());
    }
}