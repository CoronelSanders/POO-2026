public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cor: " + cor);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " mia: Miau!");
    }
}
