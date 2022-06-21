package oo.heranca.desafio;

public class Carro {

    int velocidadeAtual;
    final int VELOCIDADE_MAXIMA;

    protected Carro (int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){

        if(VELOCIDADE_MAXIMA >= velocidadeAtual + 5 ){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += 5;
        }
    }

    public void frear(){
        if(velocidadeAtual >= 5) {
            this.velocidadeAtual -= 5;
        }else {
            velocidadeAtual = 0;
        }
    }

    public String toString(){
        return "Velocidade atual é: "+velocidadeAtual+"Km/h";
    }
}
