package oo.heranca.desafio;

public class Carro {

    int velocidadeAtual;
    final int VELOCIDADE_MAXIMA;
    int delta = 0;

    protected Carro (int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){

        if(VELOCIDADE_MAXIMA >= velocidadeAtual + delta ){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += delta;
        }
    }

    public void frear(){
        if(velocidadeAtual >= delta) {
            this.velocidadeAtual -= delta;
        }else {
            velocidadeAtual = 0;
        }
    }

    public String toString(){
        return "Velocidade atual é: "+velocidadeAtual+"Km/h";
    }
}
