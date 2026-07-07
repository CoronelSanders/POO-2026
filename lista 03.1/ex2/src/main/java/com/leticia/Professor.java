package com.leticia;

public class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    public Professor() {
        super();
    }

    public Professor(String nome, int idade, String disciplina, double salario) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void cadastrar(String nome, int idade, String disciplina, double salario) {
        super.cadastrar(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void exibirProfessor() {
        exibirDados();
        System.out.println("Disciplina: " + disciplina + ", Salario: " + salario);
    }
}
