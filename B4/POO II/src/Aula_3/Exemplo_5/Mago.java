package Aula_3.Exemplo_5;

public class Mago extends Personagem implements Habilidade{
  public Mago(String nome, String nivel) {
    super(nome, nivel);
  }

  @Override
  public void usarHabilidade() {
    System.out.println("Twofold hex!");
  }

  @Override
  public void atacar() {
    System.out.println("Spirit Abjuration!");
  }
}
