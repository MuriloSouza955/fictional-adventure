package oo.heranca.desafio;

public class Ferrari extends Carro{


    public Ferrari(){
        this(315);
    }
    public Ferrari(int velocMax){
        super(velocMax);
    }
    @Override
    public void acelerar(){
        if(VELOCIDADE_MAXIMA >= velocidadeAtual + 20 ){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += 20;
        }
    }
}
