package Aula_6.Atividade_15;

public abstract class MaterialBiblioteca {
  private final String codigo,titulo;



    protected MaterialBiblioteca(String codigo, String titulo) throws Exception{
      if (codigo.trim().isEmpty() ||titulo.trim().isEmpty() || codigo.isBlank() || titulo.isBlank()){
        throw new IllegalArgumentException();
      }
      this.codigo = codigo;
      this.titulo = titulo;
    }

  public String getCodigo() {
    return codigo;
  }

  public String getTitulo() {
    return titulo;
  }

  public void exibirDados(){
    System.out.printf("Código: %s%nTítulo: %s%n",getCodigo(),getTitulo());
  }

  public abstract void exibirSituacao();
}
