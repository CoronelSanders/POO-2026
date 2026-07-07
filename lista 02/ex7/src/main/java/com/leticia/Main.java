public class Main {
    public static void main(String[] args) {
        Prontuario prontuario = new Prontuario("PR-4521", "O+", "Nenhuma conhecida");
        Paciente paciente = new Paciente("Lucia", 42, prontuario);

        paciente.exibirPaciente();
    }
}
