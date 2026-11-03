package Aula_3.Exemplo_3;

public class Main {
  static void main() {
    Encomenda shipment = new Encomenda("2","Shangai");
    Veiculo plane = new Veiculo("Americam airlines","boing","EMEA");

    shipment.rastrear();
    plane.rastrear();

    consultarLocalizacao(shipment);
    consultarLocalizacao(plane);
  }
  public static void consultarLocalizacao(Rastreavel item){
    System.out.println();
    item.rastrear();

  }
}
