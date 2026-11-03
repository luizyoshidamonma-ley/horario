package Aula_5.Exemplo_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  static void main() {
    Scanner sc = new Scanner(System.in);
    double numerador,denominador,resultado;
    int[] lista = {1,3};
    String a="a";


    System.out.println("Informe o denominador");
/*    denominador = sc.nextDouble();*/


    try {
      System.out.println("Informe o numerador");
      numerador = sc.nextDouble();
      resultado = numerador;
      System.out.println(resultado);
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } catch (InputMismatchException e) {
      System.out.println(e.getMessage());
    }

    finally {
      System.out.println("Pronto");
      sc.close();
    }

    System.out.println("Passou o try catch");
  }
}
