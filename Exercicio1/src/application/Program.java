package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Insira base e altura: ");
		retangulo.base = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		System.out.println("AREA = "+ String.format("%.2f", retangulo.areaRetangulo()));
		System.out.println("PERIMETRO = "+ String.format("%.2f", retangulo.perimetroRetangulo()));
		System.out.println("DIAGONAL = "+ String.format("%.2f" ,retangulo.diagonalRetangulo()));
		
		sc.close();
	}

}
