package application;

import java.util.Locale;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {

		Conta conta;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter account holder: ");
		String nome = sc.nextLine();

		System.out.println("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response != 'n') {

			System.out.println("Enter initial deposit value:");
			double depositoInicial = sc.nextDouble();
			
			conta = new Conta(numeroConta, nome, depositoInicial);
		}else {
			conta = new Conta(nome, numeroConta);
		}
		System.out.println("");
		System.out.println("Account data:");
		System.out.println(conta);

		System.out.println("");
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Updated data:");
		System.out.println(conta);
		
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Updated data:");
		System.out.println(conta);
		
//		System.out.println(conta.getNome());
		
		sc.close();
	}

}
