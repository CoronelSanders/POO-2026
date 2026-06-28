package com.leticia;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }   

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
        return salario;
    }

    public String exibirFuncionario() {
        return "Nome do funcionário: " + nome + 
                ", cargo: " + cargo + 
                ", salário: " + salario;
    }
    
}
