package br.com.caelum.fj11;

public class ContaPoupanca extends Conta {
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
	
}
