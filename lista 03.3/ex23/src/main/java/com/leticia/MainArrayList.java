// Versao REFATORADA do exercicio 6, usando ArrayList em vez de array.
import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Pedro", 19, "2024001", "Sistemas de Informacao"));
        alunos.add(new Aluno("Aline", 21, "2024002", "Ciencia da Computacao"));
        alunos.add(new Aluno("Bruno", 22, "2024003", "Engenharia de Software"));
        // Diferente do array, aqui e possivel continuar adicionando alunos
        // livremente sem precisar redefinir um tamanho fixo:
        alunos.add(new Aluno("Carla", 24, "2024004", "Engenharia Civil"));

        System.out.println("Alunos cadastrados (ArrayList):");
        for (Aluno aluno : alunos) {
            aluno.exibirDados();
            System.out.println();
        }

        System.out.println("Total de alunos: " + alunos.size());
    }
}
