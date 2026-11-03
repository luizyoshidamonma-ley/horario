package Aula_3.Atividade_7;

public class Professor extends Funcionario implements Registravel{
    float quantidadeHoras, valorHora;

    public Professor(String nome, String matricula, float quantidadeHoras, float valorHora) {
        super(nome, matricula);
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
    }

    @Override
    public void calcularSalario() {
        System.out.printf("O salário do/da %s é %.2f R$%n",nome,(quantidadeHoras*valorHora));
    }

    @Override
    public void registrarPresenca() {
        System.out.printf("O professor/professora %s registrou presença%n",nome);
    }
}
