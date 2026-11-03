package Aula_5.Atividade_12;

import java.util.Scanner;

public class Main {
  static void main() {
    Scanner sc = new Scanner(System.in);
    String idade,nome;

    System.out.println("Qual a idade do aluno? ");
    idade = sc.nextLine();

    System.out.println("Qual o nom do aluno? ");
    nome = sc.nextLine();


    try {
      Aluno aluno = new Aluno(nome,Integer.parseInt(idade));
      aluno.exibirDados();
    } catch (NumberFormatException e) {
      System.out.println("Idade inválida! Digite um número inteiro! Erro: "+e);
    }finally {
      System.out.println("Tentativa de cadastro finalizada");
    }
  }
}
