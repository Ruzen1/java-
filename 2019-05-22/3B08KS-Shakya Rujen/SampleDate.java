import java.time.LocalDate;

public class SampleDate {
public static void main(String[] args) {
	LocalDate today= LocalDate.now();
	System.out.println(today);
	for(int i=1;i<8;i++) {
		System.out.println(today.plusDays(i));
	}
}
}