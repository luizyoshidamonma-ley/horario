package Aula_2;

public class Mago extends Personagem{
    public Mago(String nome, int nivel,int vida) {
        super(nome, nivel,vida);
        this.dano = random.nextInt(0 , 100);
    }


    @Override
    public void atacar(Personagem alvo) {
        System.out.printf("%nTwoHex fold! causou %d de dano%n",dano);
    }


    @Override
    public void exibirStatus(String nome, int nivel) {

    }
}
