package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConversaoDeDataHora {
	public static void main(String[] args) {
		
		LocalDate fmt1 = LocalDate.parse("2022-07-24");
		LocalDateTime fmt2 = LocalDateTime.parse("2022-07-24T12:36:40");
		Instant fmt3 = Instant.parse("2022-07-24T01:36:40Z");
		
		//for(String s: ZoneId.getAvailableZoneIds() ) {
		//	System.out.println(s);
		//}
		
		LocalDate r1 = LocalDate.ofInstant(fmt3, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(fmt3, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(fmt3, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(fmt3, ZoneId.of("Portugal"));
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		System.out.println("Dia: "+ fmt1.getDayOfMonth());
		System.out.println("Mês: "+ fmt1.getMonthValue());
		System.out.println("Ano: "+ fmt1.getYear());
		
		
		
		
		
	}

}
