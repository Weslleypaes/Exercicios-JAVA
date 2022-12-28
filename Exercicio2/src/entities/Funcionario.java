package entities;

public class Funcionario {
	public String name;
	public double salario;
	public double taxa;
	
	public double salarioLiquido() {
		return salario - taxa;
	}
	
	public String toString() {
		return name + ", $"+ String.format("%.2f", salarioLiquido());
	}
	
	public void incrementaPorcentagem(double porcentagem) {
		salario = salario + (salario * (porcentagem / 100));
	}
	
}
