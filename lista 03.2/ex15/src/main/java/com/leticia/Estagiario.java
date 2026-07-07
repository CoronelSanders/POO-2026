public class Estagiario extends Funcionario {
    private String instituicaoEnsino;

    public Estagiario() {
        super();
    }

    public Estagiario(String nome, double salario, String instituicaoEnsino) {
        super(nome, salario);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public void exibirEstagiario() {
        exibirDados();
        System.out.println("Instituicao de ensino: " + instituicaoEnsino);
    }
}
