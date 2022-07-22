package oo.encapsulamento;

import java.sql.SQLOutput;

public class Pessoa {

    private int idade = 0;
    private String nome;
    private String sobrenome;

    Pessoa( String nome, String sobrenome, int idade){
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setIdade(idade);
    }

    Pessoa(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return getNome()+" "+getSobrenome();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0 && idade <= 120) {
            this.idade = idade;
        }else {
            System.out.println("Idade não atribuida, invalida!!!!");
        }
    }

    @Override
    public String toString() {
        return "Olá, eu sou o "+getNomeCompleto()+" e tenho "+getIdade()+" anos.";
    }
}
