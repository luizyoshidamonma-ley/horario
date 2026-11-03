package Aula_5.Atividade_13;



import java.util.Scanner;

public class Main {
  static void main() throws Exception {
    ContaBancaria c1 = null;
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual o nome do titular da conta?");
    String titular = sc.nextLine();
    int opcao = -1;

    try {
      c1 = new ContaBancaria(titular,500);

    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    do {
      System.out.println("1 - Saque");
      System.out.println("2 - Exibir Dados");
      System.out.println("0 - Sair");
      System.out.print("Escolha uma opcao: ");
      opcao = sc.nextInt();
      sc.nextLine();
      switch (opcao){
        case 1: {
          String valor;
          System.out.println("Qual o valor a ser sacado?");
          valor= sc.nextLine();
          try {

            c1.sacar(Double.parseDouble(valor));
          } catch (SaldoInsuficienteException e){
            System.out.println("Erro! Saldo insuficiente " + e.getMessage());

          }catch (NumberFormatException e) {
            System.out.println("Erro! formato do número é inválido " + e.getMessage());

          }catch (IllegalArgumentException e){
            System.out.println("Erro! Argumento inválido " + e.getMessage());
          }

          finally {
            System.out.println("Saldo após o saque: "+c1.getSaldo());
          }break;

        }
        case 2:{
          c1.exibirDados();

        }break;
        case 0:{
          System.out.println("Encerrando");
          break;
        }
        default:{
          System.out.println("Erro! por favor digite um número válido");
        }break;
      }

    } while (opcao != 0);


    sc.close();
  }
}
