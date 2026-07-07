public class Main {
    public static void main(String[] args) {
        PlacaMae placaMae = new PlacaMae("ASUS ROG Strix B550", "AMD B550");
        Computador computador = new Computador("Dell", "AMD Ryzen 7", placaMae);

        computador.exibirConfiguracao();
    }
}
