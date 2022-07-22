package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8, 8.0, 90);
        Aluno a2 = new Aluno("Bia", 5.8, 9.0, 85);
        Aluno a3 = new Aluno("Daniel", 9.8, 6.0, 80);
        Aluno a4 = new Aluno("Gui ", 6.8, 8.0, 75);
        Aluno a5 = new Aluno("Rebeca", 7.1, 9.0, 80);
        Aluno a6 = new Aluno("Pedro", 8.8, 9, 98);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovadoNotaProva = a -> a.notaProva >= 7;
        Predicate<Aluno> aprovadoNotaTrabalho = a -> a.notaTrabalho >= 7;
        Predicate<Aluno> aprovadoPresenca = a -> a.presenca >= 80;
        Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!!!";

        alunos.stream()
                .filter(aprovadoNotaProva)
                .filter(aprovadoNotaTrabalho)
                .filter(aprovadoPresenca)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
    }
}
