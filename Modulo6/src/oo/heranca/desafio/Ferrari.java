package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    public Ferrari(){
        this(315);
    }
    public Ferrari(int velocMax){
        super(velocMax);
        setDelta(15);
    }
//    public void acelerar(){
//        if((velocidadeAtual + getDelta()) >= VELOCIDADE_MAXIMA){
//            velocidadeAtual = VELOCIDADE_MAXIMA;
//        }else if ((velocidadeAtual + getDelta()) < VELOCIDADE_MAXIMA){
//            velocidadeAtual += getDelta();
//        }
//    }

    public void ligarTurbo(){
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarArCondicionado() {
        ligarAr = true;
    }

    @Override
    public void desligarArCondicionado() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr){
             return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }
}
