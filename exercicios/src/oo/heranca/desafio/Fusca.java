package oo.heranca.desafio;

public class Fusca extends Carro{

    public Fusca(int velocMax){
        super(velocMax);
    }
    @Override
    public void acelerar(){
        this.velocidadeAtual += 5;
    }
}
