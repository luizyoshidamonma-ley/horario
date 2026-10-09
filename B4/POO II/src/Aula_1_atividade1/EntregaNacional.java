package Aula_1_atividade1;

public class EntregaNacional extends Entrega{
    private final double distancia;

    public EntregaNacional(String codigoPedido, double distancia) {
        super(codigoPedido);
        this.distancia = distancia;
    }

    @Override
    double calcularFrete() {
        return distancia*1.5;
    }

    @Override
    public void exibirResumo() {
        super.exibirResumo();

    }
}
