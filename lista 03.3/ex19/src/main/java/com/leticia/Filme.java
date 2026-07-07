public class Filme extends Midia {
    private int duracaoMinutos;

    public Filme(String titulo, int ano, int duracaoMinutos) {
        super(titulo, ano);
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("  Duracao: " + duracaoMinutos + " min");
    }
}
