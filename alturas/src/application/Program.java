package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas ? ");
		int n = sc.nextInt();
		
		String [] nome = new String[n];
		double [] altura = new double[n];
		int [] idade = new int[n];
		
		
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa %n", i+1);
			
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
		}
		
		double alturaSoma = 0;
		int qtd = 0;
		for(int i = 0; i < n; i++) {
			alturaSoma += altura[i];
			if(idade[i] < 16) {
				qtd += 1;
			}
		}
		
		double alturaMedia = alturaSoma/altura.length;
		
		double menor = qtd * 100 / n;
		
		System.out.println("Altura media: "+ String.format("%.2f", alturaMedia));
		
		System.out.println("Pessoas com menos de 16 anos: "+ String.format("%.1f", menor)+"%");
		
		for(int i = 0; i < n; i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		
		sc.close();
	}

}
