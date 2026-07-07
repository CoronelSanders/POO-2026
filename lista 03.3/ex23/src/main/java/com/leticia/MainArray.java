// Versao ORIGINAL do exercicio 6, usando array de tamanho fixo.
public class MainArray {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[3];

        alunos[0] = new Aluno("Pedro", 19, "2024001", "Sistemas de Informacao");
        alunos[1] = new Aluno("Aline", 21, "2024002", "Ciencia da Computacao");
        alunos[2] = new Aluno("Bruno", 22, "2024003", "Engenharia de Software");

        System.out.println("Alunos cadastrados (array):");
        for (Aluno aluno : alunos) {
            aluno.exibirDados();
            System.out.println();
        }
    }
}
