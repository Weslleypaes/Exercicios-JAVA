package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Bob");
		list.add("Joao");
		list.add("Alex");
		list.add(2, "Weslley");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("================================");
		
//		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("================================");
		
		System.out.println("Index of Bob: "+ list.indexOf("Bob"));
		System.out.println("Index of Carl: "+ list.indexOf("Carl"));
		
		System.out.println("================================");
		
		//Para filtrar todos os nomes que começa com letra W de uma lista
		
		//Primeiro converto para stream,  |faço operação lambda q eu quero| e depois volto para lista.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'W').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("================================");
		//Filtrando e pegando o PRIMEIRO elemento que inicia com a letra B, se não existir, retornará null.
		String name = list.stream().filter(x -> x.charAt(0) == 'T').findFirst().orElse(null);
		System.out.println(name);
 	}

}
