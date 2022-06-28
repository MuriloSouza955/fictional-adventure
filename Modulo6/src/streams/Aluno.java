package streams;

public class Aluno {

    final String nome;
    final double notaProva;
     double notaTrabalho;
     int presenca;

    public Aluno(String nome, double notaProva, double notaTrabalho, int presenca) {
        this.nome = nome;
        this.notaProva = notaProva;
        this.notaTrabalho = notaTrabalho;
        this.presenca = presenca;
    }

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.notaProva = nota;
    }
}
