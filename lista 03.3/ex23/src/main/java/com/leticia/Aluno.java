public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno() {
        super();
    }

    public Aluno(String nome, int idade, String matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cadastrar(String nome, int idade, String matricula, String curso) {
        super.cadastrar(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matricula: " + matricula + " | Curso: " + curso);
    }
}
