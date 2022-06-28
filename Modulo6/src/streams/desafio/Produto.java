package streams.desafio;

public class Produto {

    final String nome;
    final double preco;
    final boolean freteGratis;

    public Produto(String nome, double preco, boolean freteGratis) {
        this.nome = nome;
        this.preco = preco;
        this.freteGratis = freteGratis;
    }

    @Override
    public String toString() {
        return "Produto: "+ this.nome;
    }
}
