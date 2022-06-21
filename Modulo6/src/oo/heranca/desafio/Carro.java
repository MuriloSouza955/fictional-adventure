package oo.heranca.desafio;

public class Carro {

    int velocidadeAtual;
    final int VELOCIDADE_MAXIMA;

    Carro (int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(){

        if(VELOCIDADE_MAXIMA >= velocidadeAtual + 5 ){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += 5;
        }
    }

    void frear(){
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
