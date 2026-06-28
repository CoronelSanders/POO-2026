package com.leticia;

public class ContaBancaria {

    private int numero;
    private int titular;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public int getTitular() {
        return titular;
    }

    public void setTitular(int titular) {
        this.titular = titular;
    }

    public double depositar(double valor){
        saldo += valor;
        return saldo;
    }

    public double sacar(double valor){
        if (valor <= saldo) {
            saldo -= valor;
            return saldo;
        } else {
            System.out.println("Saldo insuficiente, pobre.");
            return saldo;
        }
    }
    
}
