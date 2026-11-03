package Aula_4.Atividade_9;

public class CursoOnline extends Curso implements Certificavel{

  public CursoOnline(String nome, int cargaHoraria) {
    super(nome, cargaHoraria);
  }

  @Override
  public void emitirCertificado(String nome) {
    System.out.printf("O %s finalizou e o seu certificado de curso online foi emitido%n",nome);
  }

  @Override
  public double calcularValor() {
    return 15.00;
  }


}
