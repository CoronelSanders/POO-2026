public class LivroDidatico extends Livro {
    private String disciplina;

    public LivroDidatico() {
        super();
    }

    public LivroDidatico(String titulo, String autor, String disciplina) {
        super(titulo, autor);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + disciplina);
    }
}
