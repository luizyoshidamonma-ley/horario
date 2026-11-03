package Aula_2;

public class Atividade_Matheus {
  public void main(String[] args) {

    System.out.println("Chegou base " + Fibonacci(6));
  }
  //objetivo dessa função:
// calculo fatorial todos os números de x até o 0

  public int Fibonacci(int x) {

    if (x == 0){
      return 0;
    }
    if (x ==1){
      return 1;
    }
    return  (Fibonacci(x-1) + Fibonacci(x-2));

  }

}
