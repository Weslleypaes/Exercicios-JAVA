package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = "+ String.format("%.2f", aluno.calculaNota()));
		if ( aluno.calculaNota() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", aluno.faltaNota());
		}
		
		sc.close();
	}

}
