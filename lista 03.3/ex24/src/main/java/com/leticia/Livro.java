public class Livro {
    protected String titulo;
    protected String autor;
    protected String codigo;

    public Livro(String titulo, String autor, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void exibirDados() {
        System.out.println(getClass().getSimpleName() + " [" + codigo + "] " + titulo + " - " + autor);
    }
}
