package com.leticia;

import com.leticia.Pessoa;
import com.leticia.Produto;
import com.leticia.Biblioteca;

public class Main {
    public static void main(String[] args) {

        /// EXERCICIO 1
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Leticia");
        pessoa.setIdade(21);

        System.out.println("\nDados da pessoa:");
        System.out.println(pessoa.exibirDados());

        /// EXERCICIO 2
        Produto produto1 = new Produto();
        produto1.setNome("Notebook gamer");
        produto1.setPreco(4500.00);

        Produto produto2 = new Produto();
        produto2.setNome("Mouse gamerr");
        produto2.setPreco(12.50);

        System.out.println("\nInformações dos produtos:");
        System.out.println(produto1.mostrarInformacoes());
        System.out.println(produto2.mostrarInformacoes());

        /// EXERCICIO 15
        Biblioteca livro1 = new Biblioteca();
        livro1.setTitulo("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        livro1.setCodigo(001);
        livro1.setDisponivel(true);

        Biblioteca livro2 = new Biblioteca();
        livro2.setTitulo("O Pequeno Príncipe");
        livro2.setAutor("Antoine de Saint-Exupéry");
        livro2.setCodigo(002);
        livro2.setDisponivel(true);

        Biblioteca livro3 = new Biblioteca();
        livro3.setTitulo("A Menina que Roubava Livros");
        livro3.setAutor("Markus Zusak");
        livro3.setCodigo(003);
        livro3.setDisponivel(true);

        System.out.println(livro1.emprestar());
        System.out.println(livro2.emprestar());
        System.out.println(livro3.emprestar());
        System.out.println(livro2.devolver());
        System.out.println(livro1.emprestar());

        System.out.println("\nEstado final dos livros:");
        System.out.println(livro1.exibirInformacoes());
        System.out.println(livro2.exibirInformacoes());
        System.out.println(livro3.exibirInformacoes());
    }


}