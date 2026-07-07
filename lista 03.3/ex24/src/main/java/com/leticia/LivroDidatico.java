public class LivroDidatico extends Livro {
    private String disciplina;

    public LivroDidatico(String titulo, String autor, String codigo, String disciplina) {
        super(titulo, autor, codigo);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("  Disciplina: " + disciplina);
    }
}
