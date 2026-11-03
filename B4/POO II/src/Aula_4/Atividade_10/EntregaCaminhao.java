package Aula_4.Atividade_10;

public class EntregaCaminhao extends Entrega implements Rastreavel{
  public EntregaCaminhao(String codigo, double distanciaKm) throws Exception {
    super(codigo, distanciaKm);
  }

  @Override
  public void exibirDados() {
    super.exibirDados();
    rastrear();
    System.out.println(calcularFrete()+" R$");
  }

  @Override
  public double calcularFrete() {
    return (5*getDistanciaKm())+30;
  }

  @Override
  public void rastrear() {
    System.out.printf("A entrega está a caminho por meio de um caminhão%nCódigo de entrega: %s%n",getCodigo());
  }
}
