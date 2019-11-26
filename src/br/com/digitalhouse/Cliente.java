package br.com.digitalhouse;

public class Cliente {

    //Atributos
    private int numeroConta;
    private String nome;
    private String sobrenome;
    private String rg;
    private String cpf;

    //Construtor padrão
    public Cliente(){
    }

    //Contrutor específico
    public Cliente (int numeroConta, String nome, String sobrenome, String rg, String cpf){
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
    }

    //Setters
    public void setNumeroConta (int numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public void setSobrenome (String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setRg (String rg){
        this.rg = rg;
    }

    public void setCpf (String cpf){
        this.cpf = cpf;
    }

    //Getters
    public int getNumeroConta (){
        return this.numeroConta;
    }

    public String getNome (){
        return this.nome;
    }

    public String getSobrenome (){
        return this.sobrenome;
    }

    public String getRg (){
        return this.rg;
    }

    public String getCpf (){
        return this.cpf;
    }
}
