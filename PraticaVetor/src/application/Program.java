package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanta pessoas ? ");
		int N = sc.nextInt();
		
		double [] vetor = new double[N];
		
		double sum = 0;
		double qtd = 0;
		for(int i = 0; i < N; i++) {
			vetor[i] = sc.nextDouble();
			sum += vetor[i];
	
		}
		double media = sum / N;
		System.out.printf("Altura media: %.2f", media);

	}

}
