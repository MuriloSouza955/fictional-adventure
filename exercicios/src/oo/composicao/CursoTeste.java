package oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {


        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("WEB 2023");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno alunos : curso3.alunos)
        System.out.println(alunos.nome + " esta cursando "+curso3.nome);

        System.out.println("Alunos de "+curso1.nome+" são: "+aluno1.cursos.get(0).alunos);
        System.out.println("Alunos de "+curso2.nome+" são: "+aluno1.cursos.get(1).alunos);
        System.out.println("Alunos de "+curso3.nome+" são: "+aluno1.cursos.get(2).alunos);

        Curso cursoEncontrado = aluno1.obterCursoProcurado("Java Completo");

        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
