package entities;

public class Retangulo {
	public double base;
	public double altura;
	
	public double areaRetangulo() {
		return base * altura;
	}
	
	public double perimetroRetangulo() {
		return 2 * (base + altura);
	}
	
	public double diagonalRetangulo() {
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
	}
}
