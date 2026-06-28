package com.leticia;

public class Retangulo {
    
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String calcularArea() {
        return "Área do retângulo: " + (base * altura);
    }
    
}
