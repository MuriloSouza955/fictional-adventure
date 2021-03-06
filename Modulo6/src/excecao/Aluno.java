package excecao;

import java.util.Objects;

public class Aluno {

    public String nome;
    public double notaProva;
     public double notaTrabalho;
     public int presenca;

     public boolean bomComportamento;

    public Aluno(String nome, double notaProva, double notaTrabalho, int presenca) {
        this.nome = nome;
        this.notaProva = notaProva;
        this.notaTrabalho = notaTrabalho;
        this.presenca = presenca;
    }

    public Aluno (String nome, double nota, boolean bomComportamento){
        this.nome = nome;
        this.notaProva = nota;
        this.bomComportamento = bomComportamento;
    }

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.notaProva = nota;
    }

    public String toString(){
        return nome + " tem nota "+ notaProva;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(aluno.notaProva, notaProva) == 0 && Double.compare(aluno.notaTrabalho, notaTrabalho) == 0 && presenca == aluno.presenca && nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, notaProva, notaTrabalho, presenca);
    }
}
