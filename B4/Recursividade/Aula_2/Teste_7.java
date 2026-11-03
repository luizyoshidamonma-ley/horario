package Aula_2;

public class Teste_7 {
  public void main(String[] args) {

    System.out.println("Chegou base " + Fibonacci(6));
  }
//objetivo dessa função:
// calculo fatorial todos os números de x até o 0
  int temp1=0 ,temp2=1 , acumulador=0;

  public int Fibonacci(int x) {


    if (x > 0) {
      Fibonacci(x - 1);

      acumulador= somaValores(temp1, temp2);
      System.out.printf("A temp1 = %d  ;  temp2 = %d  ;   acumulador = %d%n",temp1,temp2,acumulador);
      temp1 = temp2;
      temp2 = acumulador;

      return acumulador;
    }else {
      return 1;
    }

  }

  public static int somaValores(int numero1,int numero2){
    return numero1 + numero2;
  }
}
