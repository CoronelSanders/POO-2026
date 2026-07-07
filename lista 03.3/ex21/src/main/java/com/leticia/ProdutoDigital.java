public class ProdutoDigital extends Produto {
    private double tamanhoMB;

    public ProdutoDigital(String nome, double preco, double tamanhoMB) {
        super(nome, preco);
        this.tamanhoMB = tamanhoMB;
    }

    public double getTamanhoMB() {
        return tamanhoMB;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("  Tamanho: " + tamanhoMB + "MB");
    }
}
