package Aula_2;
import java.util.Random;

public abstract class Personagem {
    String nome;
    int nivel;
    int vida;
    int dano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    Random random = new Random();

    public Personagem(String nome, int nivel,int vida) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    public void exibirStatus(){
        System.out.printf("%s está no nível %d%n e tem %d vida",nome,nivel,vida);
    }

    public abstract void atacar(Personagem alvo);

    public abstract void exibirStatus(String nome, int nivel);
}
