package Aula_6.Atividade_15;

public class Livro extends MaterialBiblioteca implements Emprestavel{
  private boolean emprestado = false;

  public Livro(String codigo, String titulo) throws Exception {
    super(codigo, titulo);
  }

  @Override
  public void emprestar() {
      if (!emprestado){
        System.out.println("Livro emprestado!");
        emprestado = true;
      }else if (emprestado) {
        throw new IllegalStateException();
      }
  }

  @Override
  public void devolver() {
      if (emprestado) {
        System.out.println("Livro devolvido!");
        emprestado = false;
      }else if (!emprestado){
        throw new IllegalStateException();
      }
    }





  @Override
  public void exibirSituacao() {
    if (!emprestado) {
      System.out.println("O livro está disponível");
    }
    else if(emprestado){
      System.out.println("O livro está indisponível");
    }
    System.out.println();
  }
}
