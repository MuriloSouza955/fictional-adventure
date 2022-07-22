package excecao.personalizadaB;

import excecao.Aluno;

public class Validar {
    private Validar() {
    }

    public static void aluno(Aluno aluno) throws StringVaziaException, NumeroForaDoIntervaloException{

        if (aluno == null) {
            throw new IllegalArgumentException("O aluno está nulo.");
        }

        if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("nome");
        }

        if (aluno.notaProva < 0 || aluno.notaProva > 10){
            throw new NumeroForaDoIntervaloException("nota fora do intervalo");
        }

    }
}
