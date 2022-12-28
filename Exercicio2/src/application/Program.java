package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.name = sc.nextLine();
		
		System.out.print("Salario bruto: ");
		funcionario.salario = sc.nextDouble();
		
		System.out.print("Taxa: ");
		funcionario.taxa = sc.nextDouble();
		
		System.out.println("Funcionario: "+ funcionario);
		
		System.out.print("Qual a porcentagem para incrementar o salario ? ");
		double porcentagem = sc.nextDouble();
		funcionario.incrementaPorcentagem(porcentagem);
		
		System.out.println();
		System.out.println("Dados atualizados: "+ funcionario);
		
		sc.close();
	}

}
