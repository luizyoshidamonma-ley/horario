package Aula_3.Atividade_6;

public class Impressora implements Conectavel{
    private String modelo;

    public Impressora(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void desconectar() {
        System.out.println("A impressora foi desconectada");
    }

    @Override
    public void conectar() {
        System.out.println("A impressora foi conectada por USB");
    }
}
