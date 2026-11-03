package Aula_2;

public class Teste_3 {

  int vezes=5,resultado=1;

  public int recurssao(int v){
    if (v < 0){
      System.out.println("Parou!");
      return resultado;
    }
    System.out.println("Iteração: "+v);
    if (v == 0){
      System.out.println("zero");
      return resultado;
    }
    resultado = v*recurssao(v-1);
    return resultado;
  }

   void main() {
    recurssao(vezes);
    System.out.println(resultado);
  }

}
