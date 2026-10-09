package Aula_1_atividade1;

public class Main {
    static void main() {
        EntregaLocal local = new EntregaLocal("primeiro");
        EntregaNacional nacional = new EntregaNacional("segundo",200);
        local.exibirResumo();
        nacional.exibirResumo();
    }
}
