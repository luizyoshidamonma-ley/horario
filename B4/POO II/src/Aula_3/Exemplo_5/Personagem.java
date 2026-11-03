package Aula_3.Exemplo_5;

public class Personagem {
  private String nome;
  private String nivel;

  public Personagem(String nome, String nivel) {
    this.nome = nome;
    this.nivel = nivel;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNivel() {
    return nivel;
  }

  public void setNivel(String nivel) {
    this.nivel = nivel;
  }

  public void exibirDados(){
    System.out.printf("Nome: %s%nNível: %s%n",getNome(),getNivel());
  }

  public void atacar(){};
}
