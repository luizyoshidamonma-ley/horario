package Aula_4.Atividade_9;

public abstract class Curso {
  private String nome;
  private int cargaHoraria;

  public Curso(String nome, int cargaHoraria) {
    this.nome = nome;
    this.cargaHoraria = cargaHoraria;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) throws Exception{
    if (cargaHoraria < 0){
      throw new Exception("A carga horária está negativa! Erro");
    }
    this.cargaHoraria = cargaHoraria;
  }

  public double calcularValor() {
    return 0;
  }
}
