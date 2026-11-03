package Aula_2;

public class Teste_4 {

  public static int fatorial(int v){
    if (v == 0 || v == 1){
      return 1;
    }
    return fatorial(v-1)*v;
  }

  static void main() {
    System.out.println(fatorial(5));
  }
}
