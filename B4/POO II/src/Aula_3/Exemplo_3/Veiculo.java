package Aula_3.Exemplo_3;

public class Veiculo implements Rastreavel{
  private String placa;
  private String modelo;
  private String localizacao;

  public Veiculo(String placa, String modelo, String localizacao) {
    this.placa = placa;
    this.modelo = modelo;
    this.localizacao = localizacao;
  }

  @Override
  public void rastrear() {
    System.out.printf("O veículo de placa %s e modelo %s está na/o %s%n",placa,modelo,localizacao);
  }

}
