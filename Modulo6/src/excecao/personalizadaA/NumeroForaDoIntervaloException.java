package excecao.personalizadaA;

public class NumeroForaDoIntervaloException extends RuntimeException{

    private String nomeDoAtributo;

    public NumeroForaDoIntervaloException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s está fora do intervalo.", nomeDoAtributo);
    }
}
