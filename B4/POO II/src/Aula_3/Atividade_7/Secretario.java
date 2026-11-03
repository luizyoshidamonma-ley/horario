package Aula_3.Atividade_7;

public class Secretario extends Funcionario implements Registravel{
    int salarioMensal;

    public Secretario(String nome, String matricula, int salarioMensal) {
        super(nome, matricula);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public void calcularSalario() {
        System.out.println("O/A secretário/a tem salário mensal de: "+salarioMensal+ "R$");
    }

    @Override
    public void registrarPresenca() {
        System.out.println("O/A secretário/a registrou sua presença");
    }
}
