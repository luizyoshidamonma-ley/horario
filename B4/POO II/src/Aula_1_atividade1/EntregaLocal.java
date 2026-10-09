package Aula_1_atividade1;

public class EntregaLocal extends Entrega{

    public EntregaLocal(String codigoPedido) {
        super(codigoPedido);
    }

    @Override
    double calcularFrete() {
        return 10;
    }

    @Override
    public void exibirResumo() {
        super.exibirResumo();

    }
}
