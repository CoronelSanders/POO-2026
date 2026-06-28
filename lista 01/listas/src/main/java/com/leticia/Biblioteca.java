package com.leticia;

public class Biblioteca {

    private String titulo;
    private String autor;
    private int codigo;
    private boolean disponivel;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String emprestar() {
        if (disponivel) {
            disponivel = false;
            return "Livro emprestado com sucesso!";
        } else {
            return "O livro não está disponível para empréstimo.";
        }
    }

    public String devolver() {
        if (!disponivel) {
            disponivel = true;
            return "Livro devolvido com sucesso!";
        } else {
            return "O livro já está disponível.";
        }
    }

    public String exibirInformacoes() {
        return "Título: " + titulo + 
                ", Autor: " + autor + 
                ", Código: " + codigo + 
                ", Disponível: " + disponivel;
    }
}
