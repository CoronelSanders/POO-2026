package com.leticia;

public class Filme {

    private String titulo;
    private String genero;
    private int duracao;
    private double avaliacao;

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }   

    public int getDuracao() {
        return duracao;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }   

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setAvaliacao(double avaliacao) {
        alterarAvaliacao(avaliacao);
    }
    
    public String exibirFichaTecnica() {
        return "Título: " + titulo + ", Gênero: " + genero + ", Duração: " + duracao + " minutos, Avaliação: " + avaliacao;
    }

    public void alterarAvaliacao(double novaAvaliacao) {
        if (novaAvaliacao < 0) {
            this.avaliacao = 0;
        } else if (novaAvaliacao > 10) {
            this.avaliacao = 10;
        } else {
            this.avaliacao = novaAvaliacao;
        }
    }
}
