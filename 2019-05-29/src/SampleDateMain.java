import java.time.LocalDate;

public class SampleDateMain {
public static void main(String[] args) {
	LocalDate today = LocalDate.now();
	System.out.println("�����̓��t"+today);
	
	LocalDate hundred_days_after = today.plusDays(100);
	System.out.println("100����̓��t"+hundred_days_after);
	
	System.out.println("��������10����");
	for(int i =0;i<10;i++) {
		System.out.println(today.plusDays(i));
	}
}
}
