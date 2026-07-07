import java.util.ArrayList;
import java.util.Iterator;

public class Biblioteca {
    private ArrayList<Livro> acervo = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public boolean removerPorCodigo(String codigo) {
        Iterator<Livro> it = acervo.iterator();
        while (it.hasNext()) {
            Livro livro = it.next();
            if (livro.getCodigo().equals(codigo)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public Livro buscarPorTitulo(String titulo) {
        for (Livro livro : acervo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void exibirAcervo() {
        System.out.println("Acervo da biblioteca (" + acervo.size() + " livro(s)):");
        for (Livro livro : acervo) {
            livro.exibirDados();
        }
    }
}
