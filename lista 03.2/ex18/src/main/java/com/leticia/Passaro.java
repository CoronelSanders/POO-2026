public class Passaro extends Animal {
    private boolean voa;

    public Passaro(String nome, int idade, boolean voa) {
        super(nome, idade);
        this.voa = voa;
    }

    public boolean isVoa() {
        return voa;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Voa: " + (voa ? "Sim" : "Nao"));
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " canta: Piu piu!");
    }
}
