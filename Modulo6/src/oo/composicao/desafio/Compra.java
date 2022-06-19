package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

    final ArrayList<Item> itens = new ArrayList<>();

    void adicionarItens(Produto prod, int qtde){
        this.itens.add(new Item(qtde, prod));
    }

    void adicionarItens(String nome, double preco, int qtde){
        var prod = new Produto(nome, preco);
        this.itens.add(new Item(qtde, prod));
    }

    double obterValorTotal(){
        double total = 0;

        for(Item item : itens){
            total += item.qtde * item.produto.preco;
        }

        return total;
    }

}
