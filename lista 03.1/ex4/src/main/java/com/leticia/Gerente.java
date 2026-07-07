package com.leticia;

public class Gerente extends Funcionario {
    private String setor;

    public Gerente() {
        super();
    }

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void exibirGerente() {
        exibirDados();
        System.out.println("Setor: " + setor);
    }
}
