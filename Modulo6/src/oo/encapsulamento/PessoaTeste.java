package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 30);
        p1.setIdade(-30); //  alterar
        p1.setIdade(240);
        p1.setIdade(35);

//        System.out.println(p1.getIdade()); // ler
        System.out.println(p1); // toString
    }
}
