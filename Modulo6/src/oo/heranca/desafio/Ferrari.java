package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo{


    public Ferrari(){
        this(315);
    }
    public Ferrari(int velocMax){
        super(velocMax);
        delta = 15;
    }
    @Override
    public void acelerar(){
        if(VELOCIDADE_MAXIMA >= velocidadeAtual + delta ){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += delta;
        }
    }

    public void ligarTurbo(){
        delta = 35;
    }

    @Override
    public void desligarTurbo() {
        delta = 15;
    }
}
