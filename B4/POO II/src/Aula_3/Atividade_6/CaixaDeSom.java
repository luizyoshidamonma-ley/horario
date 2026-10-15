package Aula_3.Atividade_6;

public class CaixaDeSom implements Conectavel{
    private String nome;

    public CaixaDeSom(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void desconectar() {
        System.out.println("A caixa de som foi desconectada");
    }

    @Override
    public void conectar() {
        System.out.println("A caixa de som foi conectada por Bluetooth");
    }
}
