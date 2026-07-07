public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void exibirDados() {
        System.out.println(getClass().getSimpleName() + ": " + nome + " | Idade: " + idade);
    }
}
