package padroes.observer;

public class Namorada implements ChegadaAniversarianteObservador{

    @Override
    public void chegou(EventoChegadaAniversariante evento) {
        System.out.println("Avisar os convidados...");
        System.out.println("Apagar as luzes...");
        System.out.println("Aguardar um pouco...");
        System.out.println("e... surpresa!!!");
    }
}
