package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.2);
        Feijao ingrediente2 = new Feijao(0.1);
        Sorvete sobremesa = new Sorvete(0.4);
        Comida ingrediente3 = new Arroz(0.3);

        System.out.println("Peso inicial"+convidado.getPeso()+"kg");
        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
//        System.out.println(convidado.getPeso());
        convidado.comer(ingrediente3);
        System.out.println("Peso após comer arroz feijao e arroz "+convidado.getPeso()+"kg");
        convidado.comer(sobremesa);
        System.out.println("Peso após comer arroz feijao e arroz e sobremesa "+convidado.getPeso()+"kg");
    }
}
