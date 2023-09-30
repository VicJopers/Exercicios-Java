package main;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {
	public static void main(String[] args) {
		
		DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("Portugal"));
		
		LocalDate d1 = LocalDate.parse("2023-07-25");
		LocalDateTime d2 = LocalDateTime.parse("2023-07-24T01:35:12");
		Instant d3 = Instant.parse("2023-07-24T01:35:12Z");
		
		LocalDate semanaPassada = d1.minusDays(7);
		LocalDate proximaSemana = d1.plusDays(7);
		LocalDate proximoMes = d1.plusMonths(5);
		
		LocalDateTime antes = d2.minusDays(5);
		
		Instant pastWeek = d3.minus(7, ChronoUnit.DAYS);
		Instant proxWeek = d3.plus(7, ChronoUnit.DAYS);
		
		Duration t1 = Duration.between(antes, d2);
		Duration t2 = Duration.between(semanaPassada.atTime(0,0), proximoMes.atTime(0,0));
		
		
		System.out.println("Semana Passada: "+semanaPassada.format(form));
		System.out.println("Proxima Semana: "+proximaSemana.format(form));
		System.out.println("Proximos meses: "+proximoMes.format(form));
		
		System.out.println(" ");
		
		System.out.println("Intant pastWeek: "+form2.format(proxWeek));
		System.out.println("Instant proxWeek: "+form2.format(proxWeek));
		
		System.out.println("Calculo de tempo: "+t1.toDays());
		System.out.println("Calculo de tempo: "+t2.toDays());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
