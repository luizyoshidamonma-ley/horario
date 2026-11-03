package Aula_3.Atividade_7;

public abstract class Funcionario {
    String nome;
    String matricula;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirDados(){
        System.out.printf("O/A %s possui a matrícula %s%n",nome,matricula);
    }

    public abstract void calcularSalario();
}
