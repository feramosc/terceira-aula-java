package br.com.digitalhouse;

public abstract class Conta {

    //Atributos
    private Cliente cliente;
    private double saldo;

    //Métodos
    private boolean sacar (double valor){
        return true;
    }

    private String depositar (double valor){
        return ("Retorno do depósito");
    }

    private String consultar (){
        return ("Retorno do consultar");
    }

    //Getters
    public double getSaldo(double saldo){
        return this.saldo = saldo;
    }

    //Setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
