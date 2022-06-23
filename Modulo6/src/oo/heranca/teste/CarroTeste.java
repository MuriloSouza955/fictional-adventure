package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;
import oo.polimorfismo.Feijao;

public class CarroTeste {
    public static void main(String[] args) {

        Carro fusca = new Fusca(120);

        Civic civic = new Civic(180);

        Ferrari ferrari = new Ferrari(320);

        ferrari.acelerar();
        ferrari.acelerar();
//        ferrari.frear();
        ferrari.ligarTurbo();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        civic.acelerar();
        civic.ligarTurbo();
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
