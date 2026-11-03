package Aula_4.Atividade_9;

public class CursoPresencial extends Curso implements Certificavel{
  public CursoPresencial(String nome, int cargaHoraria) {
    super(nome, cargaHoraria);
  }

  @Override
  public double calcularValor() {
    return 20.00 + 50.00;
  }

  @Override
  public void emitirCertificado(String nomeAluno) {
    System.out.printf("O %s finalizou e o seu certificado de curso presencial foi emitido%n",nomeAluno);
  }
}
