import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateExercise {
public static void main(String[] args) {
	LocalDate today= LocalDate.now();
	for(int i=1;i<11;i++) {
	System.out.println(today.plusDays(i));
	}
   System.out.println("-1="+today.plusDays(-1));
   System.out.println(today.toString());
   System.out.println(today.getYear());
   System.out.println(today.getMonthValue());
   System.out.println(today.getDayOfMonth());
   System.out.println(today.getDayOfWeek());
   DayOfWeek w=today.getDayOfWeek();
   String s=w.getDisplayName(TextStyle.SHORT, Locale.JAPANESE);
   System.out.println(s);      
}
}
