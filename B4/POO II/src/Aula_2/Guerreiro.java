package Aula_2;

public class Guerreiro extends Personagem{

    public Guerreiro(String nome, int nivel,int vida) {
        super(nome, nivel,vida);
        dano = random.nextInt(0, 100);
    }

    public void atacar(Personagem alvo){
    System.out.printf("%nGolpe de machado causou %d de dano%n%n",dano);
    }

    @Override
    public void exibirStatus(String nome, int nivel) {
        super.exibirStatus();
    }

    public void receberDano(int ataque){
        vida -= ataque;
    }
}
