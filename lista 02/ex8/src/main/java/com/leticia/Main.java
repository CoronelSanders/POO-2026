public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Flores", 123, "Centro", "Maringa");
        Casa casa = new Casa("Branca", 3, endereco);

        casa.exibirCasa();
    }
}
