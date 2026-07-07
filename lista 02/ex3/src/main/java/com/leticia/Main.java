public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("V6 Flex", 280.0, "MT-98765");
        Carro carro = new Carro("Toyota", "Camry", motor);

        carro.ligarCarro();
        carro.exibirFichaTecnica();
    }
}
