package Aula_5.Exemplo_2;

public class Personalizada {
  static void main() throws Exception {
    Conta c1 = new Conta(100);

    try {
      c1.sacar(150);
    } catch (SaldoInstuficienteExcpetion e) {
      System.out.println("Erro! "+e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }


  }
}
