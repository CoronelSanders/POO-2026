package com.leticia;

public class Carro {

    private String marca;
    private String modelo;
    private int velocidade;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidade(int velocidade) {
        if (velocidade < 0) {
            this.velocidade = 0;
        } else {
            this.velocidade = velocidade;
        }
    }

    public int acelerar() {
        this.velocidade = this.velocidade + 1;
        return this.velocidade;
    }

    public int frear() {
        if (this.velocidade >= 1) {
            this.velocidade = this.velocidade - 1;
        } else {
            this.velocidade = 0;
        }
        return this.velocidade;
    }

    public String mostrarVelocidade() {
        return "Velocidade atual: " + this.velocidade;
    }
}
