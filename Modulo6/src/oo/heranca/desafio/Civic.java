package oo.heranca.desafio;

public class Civic extends Carro implements Esportivo{

    public Civic(int velocMax){
        super(velocMax);
    }

    @Override
    public void ligarTurbo() {
        setDelta(10);
    }

    @Override
    public void desligarTurbo() {
        setDelta(5);
    }
}
