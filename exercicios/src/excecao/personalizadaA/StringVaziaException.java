package excecao.personalizadaA;

public class StringVaziaException extends IllegalArgumentException{

    private String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s est? vazio.", nomeDoAtributo);
    }
}
