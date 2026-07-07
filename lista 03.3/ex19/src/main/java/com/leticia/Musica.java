public class Musica extends Midia {
    private String artista;

    public Musica(String titulo, int ano, String artista) {
        super(titulo, ano);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("  Artista: " + artista);
    }
}
