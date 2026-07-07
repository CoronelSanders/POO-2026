package com.leticia;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new LivroDidatico("Algoritmos", "Thomas Cormen", "L001", "Estrutura de Dados"));
        biblioteca.adicionarLivro(new LivroFiccao("Duna", "Frank Herbert", "L002", "Ficcao Cientifica"));
        biblioteca.adicionarLivro(new LivroFiccao("O Hobbit", "J.R.R. Tolkien", "L003", "Fantasia"));
        biblioteca.adicionarLivro(new LivroDidatico("Calculo Volume 1", "James Stewart", "L004", "Calculo I"));

        System.out.println("=== Acervo inicial ===");
        biblioteca.exibirAcervo();

        System.out.println("\nBusca por titulo 'Duna'");
        Livro encontrado = biblioteca.buscarPorTitulo("Duna");
        if (encontrado != null) {
            encontrado.exibirDados();
        } else {
            System.out.println("Livro nao encontrado.");
        }

        System.out.println("\nRemovendo o livro de codigo L003");
        boolean removido = biblioteca.removerPorCodigo("L003");
        System.out.println(removido ? "Livro removido com sucesso." : "Livro não encontrado.");

        System.out.println("\nAcervo após remoção");
        biblioteca.exibirAcervo();
    }
}
