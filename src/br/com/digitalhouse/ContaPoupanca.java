package br.com.digitalhouse;

public class ContaPoupanca extends Conta {

    //Atributos
    private double taxa;

    //Métodos
    private boolean sacar (double valor){
        return true;
    }

    private boolean recolherJuros (double juros){
        return true;
    }

    //Getter
    @Override
    public double getSaldo(double saldo) {
        return super.getSaldo(saldo);
    }

    //Setter
    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo);
    }
}
