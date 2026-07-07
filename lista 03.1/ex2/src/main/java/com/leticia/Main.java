package com.leticia;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.cadastrar("João Choma", 34, "Programacao Orientada a Objetos", 7500.0);
        professor.exibirProfessor();
    }
}
