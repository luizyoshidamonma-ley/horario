package Aula_4.Atividade_9;

public class Main {
  static void main() {
    CursoOnline online = new CursoOnline("Luan",40);
    CursoPresencial presencial = new CursoPresencial("Luiz",80);

    online.calcularValor();
    online.emitirCertificado(online.getNome());

    System.out.println("--------------------------");
    presencial.calcularValor();
    presencial.emitirCertificado(presencial.getNome());
  }


}

