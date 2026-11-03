package Aula_5.Atividade_13;

import Aula_5.Exemplo_2.SaldoInstuficienteExcpetion;


public class ContaBancaria {
  private String titular;
  private double saldo;

  public ContaBancaria(String titular, double saldo) throws Exception {

    if (titular == null || titular.isEmpty()) {
      throw new IllegalArgumentException("Titular está vazio!");
    }
    this.titular = titular;

    if (saldo < 0 || Double.isInfinite(saldo)) {
      throw new IllegalArgumentException("Saldo inválido (Negativo ou infinito)");
    }
    this.saldo = saldo;
  }


  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void sacar(double valor) throws Exception {
    try {

      if (valor <= 0 || Double.isInfinite(valor)) {
        throw new IllegalArgumentException("Valor de saque inválido! valor menor que 1 ou infinito");
      }

      if (valor > getSaldo()) {
        throw new SaldoInsuficienteException("Saldo insuficiente");
      }

      setSaldo(getSaldo() - valor);
      System.out.println("Saque realizado");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

  public void exibirDados() {
    System.out.printf("Titular: %s%nSaldo: %.2f%n", getTitular(), getSaldo());
  }


}
