public class LivroFiccao extends Livro {
    private String genero;

    public LivroFiccao(String titulo, String autor, String codigo, String genero) {
        super(titulo, autor, codigo);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("  Genero: " + genero);
    }
}
