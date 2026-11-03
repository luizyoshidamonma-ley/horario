package Aula_2;

public class Teste {
  public static void main(String[] args) {

    System.out.println("Chegou base " + somarValores(-5,0));
  }
//objetivo dessa função:
// calculo fatorial todos os números de x até o 0

  public static int somarValores(int x, int cumulativo) {
    System.out.println("entrada valor x:"+ x + " valor cumulativo: "+ cumulativo);
    if (x >= 0) {
      System.out.println("retorno x = 0 valor x:"+ x + " valor cumulativo: "+ cumulativo);
      return cumulativo;
    }
    System.out.println("retorno antes de soma valores valor x:"+ x + " valor cumulativo: "+ cumulativo);
    return somarValores(x+1,cumulativo+x);
  }
}
