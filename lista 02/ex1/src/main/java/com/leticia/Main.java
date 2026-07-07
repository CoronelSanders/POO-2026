public class Main {
    public static void main(String[] args) {
        CPF cpfJoao = new CPF("123.456.789-00", "Regular");
        Pessoa joao = new Pessoa("Joao", 25, cpfJoao);

        joao.exibirDados();
    }
}
