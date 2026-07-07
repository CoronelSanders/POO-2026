public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return "Funcionario";
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Cargo: " + getCargo() + " | Salario: R$ " + salario);
    }
}
