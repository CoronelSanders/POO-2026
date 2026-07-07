public class Podcast extends Midia {
    private int numeroEpisodios;

    public Podcast(String titulo, int ano, int numeroEpisodios) {
        super(titulo, ano);
        this.numeroEpisodios = numeroEpisodios;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("  Episodios: " + numeroEpisodios);
    }
}
