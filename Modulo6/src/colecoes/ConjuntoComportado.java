package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        SortedSet<String> listaDosAprovados = new TreeSet<>();
        listaDosAprovados.add("Ana");
        listaDosAprovados.add("Carlos");
        listaDosAprovados.add("Lucas");
        listaDosAprovados.add("Pedro");

        for(String candidato: listaDosAprovados){
            System.out.println(candidato);
        }
        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n :nums){
            System.out.println(n);
        }
    }
}
