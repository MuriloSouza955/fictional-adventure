package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {

        Carro fusca = new Fusca();

        Carro civic = new Civic();

        Carro ferrari = new Ferrari();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();

        System.out.println(ferrari.toString());
        System.out.println(civic.toString());
        System.out.println(fusca.toString());
    }
}
