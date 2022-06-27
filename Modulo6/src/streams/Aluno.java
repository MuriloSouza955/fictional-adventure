package streams;

public class Aluno {

    final String nome;
    final double notaProva;
    final double notaTrabalho;
    final int presenca;

    public Aluno(String nome, double notaProva, double notaTrabalho, int presenca) {
        this.nome = nome;
        this.notaProva = notaProva;
        this.notaTrabalho = notaTrabalho;
        this.presenca = presenca;
    }
}
