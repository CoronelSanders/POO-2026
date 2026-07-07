public class Contato {
    protected String nome;
    protected String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Telefone: " + telefone);
    }
}
