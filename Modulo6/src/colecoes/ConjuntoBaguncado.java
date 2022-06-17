package colecoes;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("O tamanho é: " + conjunto.size());

        conjunto.add("teste");

        System.out.println("O tamanho é: " + conjunto.size());

        conjunto.add("teste");

        System.out.println("O tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));

        System.out.println("O tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(false));
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains('y'));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);
/*
        conjunto.retainAll(nums);

        System.out.println(conjunto);
*/
        conjunto.clear();

        System.out.println(conjunto);
    }
}
