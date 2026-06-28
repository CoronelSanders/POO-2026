package com.leticia;

public class ReservaHotel {

    private String nomeHospede;
    private int quantidadeDiarias;
    private double valorDiaria;

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }

    public void setQuantidadeDiarias(int quantidadeDiarias) {
        this.quantidadeDiarias = quantidadeDiarias;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double calcularTotal() {
        return quantidadeDiarias * valorDiaria;
    }

    public String exibirReserva() {
        return "Nome do hóspede: " + nomeHospede +
                ", quantidade de diárias: " + quantidadeDiarias +
                ", valor da diária: " + valorDiaria +
                ", total a pagar: " + calcularTotal();
    }
}
