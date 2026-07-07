public class Main {
    public static void main(String[] args) {
        Carteirinha carteirinhaMaria = new Carteirinha("2024001", "10/02/2024");
        Aluno maria = new Aluno("Maria", "Ciencia da Computacao", carteirinhaMaria);

        maria.exibirDados();
    }
}
