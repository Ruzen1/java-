import java.time.LocalDate;

public class SampleDateMain {
public static void main(String[] args) {
	LocalDate today = LocalDate.now();
	System.out.println("¡“ú‚Ì“ú•t"+today);
	
	LocalDate hundred_days_after = today.plusDays(100);
	System.out.println("100“úŒã‚Ì“ú•t"+hundred_days_after);
	
	System.out.println("¡“ú‚©‚ç10“úŠÔ");
	for(int i =0;i<10;i++) {
		System.out.println(today.plusDays(i));
	}
}
}
