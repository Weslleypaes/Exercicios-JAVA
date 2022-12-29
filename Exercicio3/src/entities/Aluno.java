package entities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double calculaNota() {
		return  nota1 + nota2 + nota3;
	}
	
	public double faltaNota() {
		if(calculaNota() < 60) {
			return 60 - calculaNota();
		} else {
			return 0;
		}
	}
}
