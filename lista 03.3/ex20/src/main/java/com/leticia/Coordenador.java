public class Coordenador extends Pessoa {
    private String areaCoordenacao;

    public Coordenador(String nome, int idade, String areaCoordenacao) {
        super(nome, idade);
        this.areaCoordenacao = areaCoordenacao;
    }

    public String getAreaCoordenacao() {
        return areaCoordenacao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("  Area de coordenacao: " + areaCoordenacao);
    }
}
