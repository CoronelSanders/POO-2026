public class ContatoProfissional extends Contato {
    private String empresa;
    private String cargo;

    public ContatoProfissional(String nome, String telefone, String empresa, String cargo) {
        super(nome, telefone);
        this.empresa = empresa;
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Empresa: " + empresa + " | Cargo: " + cargo);
    }
}
