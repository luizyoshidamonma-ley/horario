package Aula_3.Exemplo_3;

public class Encomenda implements Rastreavel{
  private String codigo;
  private String localizacao;

  public Encomenda(String codigo, String localizacao) {
    this.codigo = codigo;
    this.localizacao = localizacao;
  }

  @Override
  public void rastrear() {
    System.out.printf("A encomenda de código %s está na/no %s%n",codigo,localizacao);
  }

}
