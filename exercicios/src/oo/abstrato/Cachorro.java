package oo.abstrato;

public class Cachorro extends Mamifero {

    public String mover(){
        return "Usando as patas";
    }
    @Override
    public String mamar() {
        return "Usando leite";
    }
}
