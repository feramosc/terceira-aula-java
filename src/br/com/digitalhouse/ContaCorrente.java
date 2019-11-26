package br.com.digitalhouse;

public class ContaCorrente extends Conta {

    //Atributos
    private double limite;

    //Métodos
    private String depositar (Cheque cheque){
        return ("Retorno do depósito");
    }

    private void sacar (double valor){

    }

    //Getters
    @Override
    public double getSaldo(double saldo) {
        return super.getSaldo(saldo);
    }

    //Setters
    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo);
    }
}
