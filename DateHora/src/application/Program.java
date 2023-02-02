package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		//INSTANCIANDO ***************
		//https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("22/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("22/01/2023 01:55:35", fmt2);
		
		LocalDate d10 = LocalDate.of(2023, 01, 13); 
		LocalDateTime d11 = LocalDateTime.of(2022, 01, 10, 04, 55);
		
		System.out.println(" d01 = "+d01.toString());
		System.out.println(" d02 = "+d02.toString());
		System.out.println(" d03 = "+d03.toString());
		System.out.println(" d04 = "+d04.toString());
		System.out.println(" d05 = "+d05.toString());
		System.out.println(" d06 = "+d06.toString());
		System.out.println(" d07 = "+d07.toString());
		System.out.println(" d08 = "+d08.toString());
		System.out.println(" d09 = "+d09.toString());
		System.out.println(" d10 = "+d10.toString());
		System.out.println(" d11 = "+d11.toString());
	}

}