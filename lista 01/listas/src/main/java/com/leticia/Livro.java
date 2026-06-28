package com.leticia;

public class Livro {

    private String titulo;
    private String autor;
    private boolean emprestado;

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

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String emprestarLivro() {
        if (!emprestado) {
            emprestado = true;
            return "Livro emprestado com sucesso!";
        } else {
            return "Livro já está emprestado.";
        }
    }

    public String devolverLivro() {
        if (emprestado) {
            emprestado = false;
            return "Livro devolvido com sucesso!";
        } else {
            return "Livro não estava emprestado.";
        }
    }

    public boolean verificarDisponibilidade() {
        return !emprestado;
    }
}