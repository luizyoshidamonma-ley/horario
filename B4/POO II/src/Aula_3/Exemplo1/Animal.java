package Aula_3.Exemplo1;

public class Animal implements SerVivo{
    public boolean vivo = true;

    @Override
    public void mover() {

    }

    @Override
    public void comer() {

    }

    @Override
    public void comer(int massa) {

    }

    @Override
    public void infor() {
        System.out.printf("Tá vivo: %s",this.vivo?"Sim":"Não");
    }
}
