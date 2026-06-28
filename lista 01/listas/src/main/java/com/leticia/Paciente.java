package com.leticia;

public class Paciente {

    private String nome;
    private double peso;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificarIMC() {
        double IMC = calcularIMC();

        if (IMC < 18.5) {
            return "Abaixo do peso";
        } else if (IMC < 25) {
            return "Peso normal";
        } else if (IMC < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
