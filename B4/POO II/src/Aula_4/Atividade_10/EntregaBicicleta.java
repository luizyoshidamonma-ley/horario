package Aula_4.Atividade_10;

public class EntregaBicicleta extends Entrega implements Rastreavel{
  public EntregaBicicleta(String codigo, double distanciaKm) throws Exception {
    super(codigo, distanciaKm);
  }

  @Override
  public void rastrear() {
    System.out.printf("A entrega está a caminho por uma bicicleta%nCódigo de entrega: %s%n",getCodigo());
  }

  @Override
  public void exibirDados() {
    super.exibirDados();
    rastrear();
    System.out.println(calcularFrete()+" R$");
  }

  @Override
  public double calcularFrete() {
    return 2*getDistanciaKm();
  }
}
