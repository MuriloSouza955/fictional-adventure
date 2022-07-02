package excecao.personalizadaB;

public class NumeroNegativoException extends RuntimeException{

    private String nomeDoAtributo;

    public NumeroNegativoException (String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s est? negativo.", nomeDoAtributo);
    }
}
