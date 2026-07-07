public class Main {
    public static void main(String[] args) {
        ISBN isbn = new ISBN("978-85-333-0227-3", "Companhia das Letras");
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", isbn);

        livro.exibirDadosCompletos();
    }
}
