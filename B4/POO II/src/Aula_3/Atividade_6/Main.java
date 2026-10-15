package Aula_3.Atividade_6;

public class Main {
    static void main() {
        Conectavel printer = new Impressora("HP");
        Conectavel speaker = new CaixaDeSom("JBL");

        printer.conectar();
        printer.desconectar();
        speaker.conectar();
        speaker.desconectar();
    }
}
