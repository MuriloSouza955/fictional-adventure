package lambdas;

public class Produto extends Object {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco R$" + preco +
                ", desconto=" + desconto +
                ", preço com desconto R$ " + preco * (1 - desconto) +
                '}';
    }
}
