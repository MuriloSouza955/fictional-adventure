package oo.heranca.desafio;

public class Fusca extends Carro{

    Fusca(int velocMax){
        super(velocMax);
    }
    @Override
    void acelerar(){
        this.velocidadeAtual += 2;
    }
}
