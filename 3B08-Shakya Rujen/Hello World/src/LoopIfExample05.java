
public class LoopIfExample05 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		for (int i = 0;i<=99;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}else if(i%5==0 ){
				System.out.println("Buzz");
			}else if (i%3==0) {
				System.out.println("Fizz");
			}else {
				System.out.println(i);
			}
		}
	}

}