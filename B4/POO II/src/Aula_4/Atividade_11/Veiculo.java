package Aula_4.Atividade_11;

public abstract class Veiculo implements Operavel{
  private final String placa;
  private String modelo;
  private double valorBaseDiaria;
  private static int totalVeiculos;
  public static final String NOME_LOCADORA = "Ipiranga"; // caixa alta = static

  public Veiculo(String placa, String modelo, double valorBaseDiaria) {
    this.placa = placa;
    this.modelo = modelo;
    this.valorBaseDiaria = valorBaseDiaria;
    totalVeiculos++;
  }

  public String getPlaca() {
    return placa;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public double getValorBaseDiaria() {
    return valorBaseDiaria;
  }

  public void setValorBaseDiaria(double valorBaseDiaria) {
    this.valorBaseDiaria = valorBaseDiaria;
  }

  public static int getTotalVeiculos() {
    return totalVeiculos;
  }

  public static void setTotalVeiculos(int totalVeiculos) {
    Veiculo.totalVeiculos = totalVeiculos;
  }

  public abstract double calcularDiaria();

  public void  exibirDados(){
    System.out.printf("Locadora: %s%nPlaca: %s%nModelo: %s%nTotal da diária: %.2f%n",NOME_LOCADORA,getPlaca(),getModelo(),getValorBaseDiaria());
  }

  public void calcularLocacao(int dias) throws Exception {
    if (dias < 0){
      throw new Exception("Quantidade de dias negativas! Erro");
    }
    System.out.println("O valor total da locação é: "+getValorBaseDiaria()*dias);
  }

  public static int totalVeiculos(){
    return totalVeiculos;
  }
  public static void verificarInformacoes(double VBC,double VBM) throws Exception {
    if (VBC <0|| VBM<0){
      throw new Exception("Valor da diária negativo!");
    }

  }
}
