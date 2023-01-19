package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		
		
		for (int i = 0; i < n; i++) {
			
			System.out.println();
			System.out.printf("Emplyoee #%d: %n", i+1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
			
		}
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase : ");
		Integer idUser = sc.nextInt();
		
		Integer pos = position(list, idUser);
//		System.out.println(pos);
		
		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage:");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		System.out.println();
		System.out.println("List of employees:");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		
		sc.close();
	}
	
	public static Integer position(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if ( list.get(i).getId() == id ) {
				return i;
			}
		}
		
		return null;
	}

}
