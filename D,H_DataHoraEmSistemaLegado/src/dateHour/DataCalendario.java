package dateHour;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DataCalendario {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		Date d1 = sdf1.parse("25/05/2023");
		Date d2 = sdf2.parse("25/05/2023 15:45:22");
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date y1 = Date.from(Instant.parse("2022-07-22T15:22:25Z"));
		
		System.out.println("--------------------");
		
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		
		System.out.println();
		
		System.out.println(sdf2.format(d1));
		System.out.println(sdf2.format(d2));
		System.out.println(sdf2.format(y1));
		
		System.out.println("--------------------");
		
		System.out.println(sdf3.format(x1));
		System.out.println(sdf3.format(x2));
		
		System.out.println();
		
		System.out.println(sdf3.format(d1));
		System.out.println(sdf3.format(d2));
		System.out.println(sdf3.format(y1));
		
		
		
		
		
		
	}
}
