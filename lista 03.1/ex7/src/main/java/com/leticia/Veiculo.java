public class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
    }
}
