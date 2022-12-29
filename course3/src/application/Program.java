package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		Não preciso, pois estou usando métodos estáticos		
//		Calculator calc = new Calculator();
		
		System.out.println("ENTER RADIUS: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		
		System.out.printf("Pi value: %.2f%n ", Calculator.PI);
		
		
		sc.close();
	}
	

}
