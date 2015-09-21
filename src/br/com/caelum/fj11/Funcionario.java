package br.com.caelum.fj11;import java.lang.reflect.Array;

public class Funcionario {
	
	Funcionario(String nome){
		
	}
	
	private String nome;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	private String departamento;
	private double salario;
	private String dataEntrada;
	private String identidade;
	
	 double recebeAumento(double aumento) {
		salario += aumento;
			return salario;
	}

	 double calculaGanhoAnual() {
		 return salario * 12;
	 }
	 
	 void mostra() {
		 System.out.println("Nome: "+ this.nome);
		 System.out.println("Departamento: " + this.departamento);
		 System.out.println("Salario: " + this.salario);
		 System.out.println("Data de Entrada: " + this.dataEntrada);
		 System.out.println("Identidade: "+ this.identidade);
		 System.out.println("Aumento de Salario: "+ this.calculaGanhoAnual());
	 }

}

class Empresa {
	
	Funcionario[] empregados;
	String cnpj;
	String nome;
	
	void adiciona(Funcionario f) {
		for(int i=0; i < empregados.length; i++)
		this.empregados[i]= f;
	}
	
	void mostraEmpregados() {
		for (int i = 0; i < this.empregados.length; i++)
			System.out.println("Funcionario na posicao: " + i);
	}

}