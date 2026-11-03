  package Aula_4.Atividade_11;

  // criar a regra de negócio nas variáveis antes de instanciar

  public class Main {
    static void main() throws Exception {
      String placaCarro="ABC1D23",modeloCarro="Onix",placaMoto="XYZ9A87",modeloMoto="CG 160";
      double valorBaseCarro=100,valorBaseMoto=60;
      int portaCarro=4,cilindrada=160;

      Veiculo.verificarInformacoes(valorBaseCarro,valorBaseMoto);

      Veiculo car = new Carro(placaCarro,modeloCarro,valorBaseCarro,portaCarro);
      Veiculo motorcycle = new Moto(placaMoto,modeloMoto,valorBaseMoto,cilindrada);

      System.out.println("Carro");
      car.exibirDados(); car.calcularLocacao(3);
      System.out.println();
      System.out.println("Moto");
      motorcycle.exibirDados(); motorcycle.calcularLocacao(3);

      Operavel carro = new Carro(placaCarro,modeloCarro,valorBaseCarro,portaCarro);
      Operavel moto = new Moto(placaMoto,modeloMoto,valorBaseMoto,cilindrada);

      System.out.println("Operavel");
      System.out.println("Carro");
      carro.ligar(); carro.desligar();
      System.out.println("Moto");
      moto.ligar(); moto.desligar();

      System.out.println("total veículos: "+Veiculo.getTotalVeiculos());
    }
  }
