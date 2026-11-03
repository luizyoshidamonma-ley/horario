package Aula_4.Atividade_10;

public class Main {
  static void main() throws Exception {
    EntregaBicicleta bike = new EntregaBicicleta("bicicleta",5);
    EntregaCaminhao truck = new EntregaCaminhao("caminhao",20);

    bike.exibirDados();
    System.out.println();
    truck.exibirDados();

  }
}
