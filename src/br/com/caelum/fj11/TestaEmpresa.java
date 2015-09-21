package br.com.caelum.fj11;

public class TestaEmpresa {
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];
		
		Funcionario f1 = new Funcionario("hIRO2");
		f1.setSalario (1000);
		empresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario("Hiro3");
		f2.setSalario (1700);
		empresa.adiciona(f2);
		
		
			empresa.mostraEmpregados();
		}
	}

