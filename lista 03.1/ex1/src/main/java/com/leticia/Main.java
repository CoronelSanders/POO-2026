package com.leticia;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.cadastrar("Leticia", 21, "134737", "Ciência da Computação");
        aluno.exibirDados();
    }
}
