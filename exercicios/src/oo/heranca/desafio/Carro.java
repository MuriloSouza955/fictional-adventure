package oo.heranca.desafio;

public class Carro {

    int velocidadeAtual;
    protected final int VELOCIDADE_MAXIMA;
    private int delta = 0;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }


    protected Carro (int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
        if((velocidadeAtual + delta) >= VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else if ((velocidadeAtual + delta) < VELOCIDADE_MAXIMA){
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
