package oo.heranca.desafio;

public class Carro {

    int velocidadeAtual;
    protected final int VELOCIDADE_MAXIMA;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    private int delta = 0;

    protected Carro (int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
        if(VELOCIDADE_MAXIMA >= (velocidadeAtual + getDelta())){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else {
            velocidadeAtual += getDelta();
        }
    }

    public void frear(){
        if(velocidadeAtual >= getDelta()) {
            this.velocidadeAtual -= getDelta();
        }else {
            velocidadeAtual = 0;
        }
    }

    public String toString(){
        return "Velocidade atual é: "+velocidadeAtual+"Km/h";
    }
}
