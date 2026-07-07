public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public String getCargo() {
        return "Vendedor";
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("  (comissao adicional: R$ " + comissao + ")");
    }
}
