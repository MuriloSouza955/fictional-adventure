package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();

        //Tanto offer e add v~ao adicionar elementos na fila, a
        // diferen'ca 'e o comportamento quando a fila esta cheia.
        // No add, ele vai retornar uma excessao, e no offer, o resultado 'e falso
        fila.add("Ana");
        fila.offer("Bia");
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

//        Mesma id'eia do add e do offer, por'em para pegar o dado, no element, vai gerar uma excessao
//        e no peek, vai retornar null caso n~ao exista nada na fila. A diferen'ca no comportamneto ocorre
//        quando a fila estiver vazia. Em nenhum dos casos, vai remover o elemento da fila
        System.out.println(fila.element());
        System.out.println(fila.element());
        System.out.println(fila.peek());
        System.out.println(fila.peek());

        //fila.size();      --> retorna o tamanho da fila.
        //fila.clear();     --> retorna a fila vazia.
        //fila.isEmpty();   --> verifica se a fila esta vazia.
//        fila.contains(...); --> verifica se determinado elemnto existe.

        // pull--> retorna o primeiro elemento da fila, ja removendo, caso nao exista, retorna null.
        // remove --> retorna o primeiro elemento da fila, e romove, caso nao exista, gera uma excessao
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
//        System.out.println(fila.remove());

    }
}
