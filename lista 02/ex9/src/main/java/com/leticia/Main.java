public class Main {
    public static void main(String[] args) {
        CNPJ cnpj = new CNPJ("12.345.678/0001-90", "Ativa");
        Empresa empresa = new Empresa("Tech Solucoes LTDA", "TechSol", cnpj);

        empresa.exibirEmpresa();
    }
}
