package Aula_1_atividade1;

public abstract class Entrega {
    public String codigoPedido;

    public Entrega(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }



    abstract double calcularFrete();

    public void exibirResumo(){
        System.out.println("Código do pedido: "+codigoPedido);
        System.out.printf("Preço: %.2f R$%n%n",calcularFrete());

    }

}
