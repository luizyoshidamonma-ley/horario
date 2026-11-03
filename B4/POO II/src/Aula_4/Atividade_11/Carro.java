package Aula_4.Atividade_11;

public class Carro extends Veiculo{
  private int quantidadePortas;

  public Carro(String placa, String modelo, double valorBaseDiaria, int quantidadePortas) {
    super(placa, modelo, valorBaseDiaria);
    this.quantidadePortas = quantidadePortas;
  }

  public int getQuantidadePortas() {
    return quantidadePortas;
  }

  @Override
  public double calcularDiaria() {
    return getValorBaseDiaria()+50;
  }

  @Override
  public void desligar() {
    System.out.println("Carro Desligado");
  }

  @Override
  public void ligar() {
    System.out.println("Carro Ligado");
  }

}
