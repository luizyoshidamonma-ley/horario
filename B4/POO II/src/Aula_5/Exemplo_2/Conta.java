package Aula_5.Exemplo_2;

public class Conta {
  private double saldo;

  public Conta(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }

  public void sacar(double valor) throws Exception {
    if (valor > saldo){
      throw new SaldoInstuficienteExcpetion("Saldo insuficiente pobre fudido ; saldo: "+saldo+" valor do saque: "+valor);
    }
    System.out.println(getSaldo() + " - "+valor);
    saldo -= valor;
    System.out.println("Novo saldo: "+getSaldo());
  }
}

