package Aula_4.Atividade_11;

public class Moto extends Veiculo{
  private int cilindrada;

  public Moto(String placa, String modelo, double valorBaseDiaria, int cilindrada) {
    super(placa, modelo, valorBaseDiaria);
    this.cilindrada = cilindrada;
  }

  public void setCilindrada(int cilindrada) {
    this.cilindrada = cilindrada;
  }

  @Override
  public double calcularDiaria() {
    return getValorBaseDiaria()+20;
  }

  @Override
  public void desligar() {
    System.out.println("Moto desligada!");
  }

  @Override
  public void ligar() {
    System.out.println("Moto ligada!");
  }
}
