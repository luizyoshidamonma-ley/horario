package Aula_2;

public class Teste_6 {
  public static void main(String[] args) {

      System.out.println("Chegou base " + somarValores(10,0));
  }
//objetivo dessa função:
// calculo fatorial todos os números de x até o 0

  public static int somarValores(int x, int cumulativo) {
    if (x <= 0) {
      return 1;
    }
    cumulativo = somarValores(x-1,cumulativo)*x;
/*
    System.out.println("retorno da iteração x:"+ x + " valor cumulativo: "+ cumulativo);
*/
    if (! (cumulativo == 1)){
      System.out.print(cumulativo +" = ");
    }else {
      System.out.println("0 = 1");
    }

    for( int i=x; i> 0; i--){
      if (i == 1){
        System.out.printf("1");
      }else {
        System.out.printf(i + " * ");
      }
    }
    System.out.println();


    return cumulativo;
  }
}
