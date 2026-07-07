public class Main {
    public static void main(String[] args) {
        Cracha cracha1 = new Cracha("F001", "31/12/2026");
        Funcionario funcionario1 = new Funcionario("Carlos", "Analista", cracha1);

        Cracha cracha2 = new Cracha("F002", "30/06/2027");
        Funcionario funcionario2 = new Funcionario("Ana", "Gerente", cracha2);

        funcionario1.exibirFuncionario();
        funcionario2.exibirFuncionario();
    }
}
