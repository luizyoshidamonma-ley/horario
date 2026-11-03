package Aula_3.Atividade_7;

public class Main {
    static void main() {
        Professor teacher = new Professor("Marcelo","1",80,40);
        Secretario secretary = new Secretario("Pedro","1000",2500);

        teacher.exibirDados();
        teacher.calcularSalario();
        teacher.registrarPresenca();
        System.out.println("-----");
        secretary.exibirDados();
        secretary.calcularSalario();
        secretary.registrarPresenca();
    }
}
