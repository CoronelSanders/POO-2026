package com.leticia;

public class Celular {

    private String marca;
    private String modelo;
    private int nivelBateria;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria < 0) {
            this.nivelBateria = 0;
        } else if (nivelBateria > 100) {
            this.nivelBateria = 100;
        } else {
            this.nivelBateria = nivelBateria;
        }
    }

    public void carregar(int valor) {
        if (valor > 0) {
            this.nivelBateria += valor;
            if (this.nivelBateria > 100) {
                this.nivelBateria = 100;
            }
        }
    }

    public void usar(int valor) {
        if (valor > 0) {
            this.nivelBateria -= valor;
            if (this.nivelBateria < 0) {
                this.nivelBateria = 0;
            }
        }
    }
}