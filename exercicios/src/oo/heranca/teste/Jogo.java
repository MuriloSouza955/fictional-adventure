package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {

        Monstro m1 = new Monstro();
        Heroi h1 = new Heroi(10, 11 );

        m1.x = 10;
        m1.y = 10;

//        h1.x = 10;
//        h1.y = 11;

        System.out.println("\n"+"Monstro tem: "+m1.vida+" de vida.");
        System.out.println("Heroi tem:   "+h1.vida+" de vida.");

        m1.atacar(h1);
        h1.atacar(m1);

        m1.atacar(h1);
        h1.atacar(m1);

        m1.andar(Direcao.Norte);
        m1.atacar(h1);
        h1.atacar(m1);

        System.out.println("\n"+"Monstro tem: "+m1.vida+" de vida.");
        System.out.println("Heroi tem:   "+h1.vida+" de vida.");
    }
}