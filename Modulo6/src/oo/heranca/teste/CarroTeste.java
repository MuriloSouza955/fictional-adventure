package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class CarroTeste {
    public static void main(String[] args) {

        Carro fusca = new Fusca(120);

        Carro civic = new Civic(180);

        Carro ferrari = new Ferrari(320);

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.frear();
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
