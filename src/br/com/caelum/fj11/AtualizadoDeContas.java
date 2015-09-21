package br.com.caelum.fj11;

public class AtualizadoDeContas  {
	private double saldoTotal = 0;
	private double selic;

	public double getSelic() {
		return selic;
	}

	public void setSelic(double selic) {
		this.selic = selic;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public void roda (Conta c) {
		System.out.println(c.getSaldo());
		c.atualiza(0.01);
		System.out.println(c.getSaldo());
	}
	
}
