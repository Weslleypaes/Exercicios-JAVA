package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		// Calculos com data-hora
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusWeeks(1);
		LocalDate plusYear = d04.plusYears(8);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusHours(4);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); 
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekLocalDate = " +pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " +nextWeekLocalDate);
		System.out.println("plusYear = "+plusYear);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		
		System.out.println("pastWeekInstant "+ pastWeekInstant);
		System.out.println("nextWeekInstant "+ nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		
		System.out.println("Duration "+ t1.toHours());
	}

}
