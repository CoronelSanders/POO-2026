public class Motor {
    private String tipo;
    private double potencia;
    private String numeroSerie;
    private boolean ligado;

    public Motor(String tipo, double potencia, String numeroSerie) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.numeroSerie = numeroSerie;
        this.ligado = false;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void exibirDados() {
        System.out.println("Motor: " + tipo + " | Potencia: " + potencia + "cv | Serie: " + numeroSerie
                + " | Status: " + (ligado ? "Ligado" : "Desligado"));
    }
}
