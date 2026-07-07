public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
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
        System.out.println("Nome: " + nome + " | Idade: " + idade + " anos");
    }

    public void emitirSom() {
        System.out.println(nome + " emite um som.");
    }
}
