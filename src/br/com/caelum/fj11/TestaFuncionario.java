package br.com.caelum.fj11;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("Hirow");
		
		f.setNome ("Hiro");
		f.setSalario (1000);
		f.recebeAumento(50);
		
		System.out.println("salario atual: " + f.getSalario());
		System.out.println("ganho anual : " + f.calculaGanhoAnual());
		
		Funcionario f1 = new Funcionario("Babara");
		f1.setNome("Danilo");
		f1.setSalario(500);
		
		Funcionario f2 = new Funcionario("Funfa");
		f2.setNome("Danilo");
		f2.setSalario(500);
		
		if(f1==f2) {
			System.out.println("iguais");
		}else {
			System.out.println("diferentes");
		}
	}
}
