package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class UsandoCalendar {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d1 = Date.from(Instant.parse("2022-07-03T15:19:22Z"));
		
		System.out.println(f1.format(d1));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d1);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d1 = cal.getTime();
		
		System.out.println(f1.format(d1));
		
		
	}

}
