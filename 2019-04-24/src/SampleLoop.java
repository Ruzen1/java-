
public class SampleLoop {
	public static void main(SampleString01[] args) {
		for(int idx=0;idx<100;idx++) {
			int i = idx+1;
			if(i%3==0) {
				System.out.printf("%02d ",i);
			}
			if(i%30==0) {
				System.out.println("\n");
			}
		}
	}

}
