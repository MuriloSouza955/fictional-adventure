package oo.heranca.desafio;

public class Ferrari extends Carro{

    Ferrari(int velocMax){
        super(velocMax);
    }
    @Override
    void acelerar(){
        this.velocidadeAtual += 15;
    }
}
