public class Pessoa {
    private String nome;
    private int idade;
    private CPF cpf;

    public Pessoa(String nome, int idade, CPF cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Idade: " + idade);
        cpf.exibirDados();
    }
}
