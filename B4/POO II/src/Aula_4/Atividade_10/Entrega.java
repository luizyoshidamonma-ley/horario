package Aula_4.Atividade_10;

public abstract class Entrega {
  private String codigo;
  private double distanciaKm;

  public Entrega(String codigo, double distanciaKm) throws Exception {
    if (getDistanciaKm() < 0){
      throw new Exception("Ditância negativa! Erro");
    }
    this.codigo = codigo;
    this.distanciaKm = distanciaKm;
  }

  public String getCodigo() {

    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public double getDistanciaKm() {

    return distanciaKm;
  }

  public void setDistanciaKm(double distanciaKm) {
    this.distanciaKm = distanciaKm;
  }

  public void exibirDados(){
    System.out.printf("Código: %s%nDistância: %.2fKm%n",getCodigo(),getDistanciaKm());
  }

  public abstract double calcularFrete();



}
