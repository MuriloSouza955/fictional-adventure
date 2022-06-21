package oo.heranca.desafio;

public class Ferrari extends Carro{


    Ferrari(){
        this(315);
    }
    Ferrari(int velocMax){
        super(velocMax);
    }
    @Override
    void acelerar(){
        if(VELOCIDADE_MAXIMA >= velocidadeAtual + 20 ){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += 20;
        }
    }
}
