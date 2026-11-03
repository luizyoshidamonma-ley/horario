package Aula_3.Exemplo_4;

public class Main {
  static void main() {
    Impressora i1 = new Impressora("hp", false);
    i1.conectar();
    i1.imprimir();
    i1.desconectar();
    i1.imprimir();
  }
}
