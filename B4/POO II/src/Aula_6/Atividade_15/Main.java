package Aula_6.Atividade_15;

public class Main {
  static void main() throws Exception {
    Livro lv = new Livro("1","t");

    try {
      lv.emprestar();
    } catch (Exception e) {
      System.out.println("Erro!" +e.getMessage());
    }finally {
      System.out.printf("Situação atual: ");
      lv.exibirSituacao();
    }

    try {
      lv.emprestar();
    } catch (Exception e) {
      System.out.println("Erro!" +e.getMessage());
    }finally {
      System.out.printf("Situação atual: ");
      lv.exibirSituacao();
    }


    try {
      lv.devolver();
    } catch (Exception e) {
      System.out.println("Erro!" +e.getCause());
    }finally {
      lv.exibirSituacao();
    }

    try {
      lv.devolver();
    } catch (Exception e) {
      System.out.println("Erro!" +e.getCause());
    }finally {
      lv.exibirSituacao();
    }


  }
}
