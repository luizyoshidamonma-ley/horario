package Aula_3.Exemplo_4;

public class Impressora implements Conectavel,Imprimivel{
  private String modelo;
  private boolean conectada;



  public Impressora(String modelo, boolean conectada) {
    this.modelo = modelo;
    this.conectada = conectada;
  }

  @Override
  public void imprimir() {
    if (!conectada) {
      System.out.println("não foi possível imprimir, a impresora está desconectada");
      return;
    }
    System.out.println(modelo +" está imprimindo");
  }

  @Override
  public void desconectar() {
    conectada = false;
    System.out.println(modelo +" foi desconectada do Wi-fi");
  }

  @Override
  public void conectar() {
    conectada = true;
    System.out.println(modelo +" foi conectada ao Wi-fi");
  }


}
