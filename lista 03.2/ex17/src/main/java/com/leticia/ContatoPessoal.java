public class ContatoPessoal extends Contato {
    private String relacao;

    public ContatoPessoal(String nome, String telefone, String relacao) {
        super(nome, telefone);
        this.relacao = relacao;
    }

    public String getRelacao() {
        return relacao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Relacao: " + relacao);
    }
}
