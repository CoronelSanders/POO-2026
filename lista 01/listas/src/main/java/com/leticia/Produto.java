package com.leticia;

public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String mostrarInformacoes() {
        return "Nome do produto: " + nome + ", preço: " + preco;
    }
    
}
