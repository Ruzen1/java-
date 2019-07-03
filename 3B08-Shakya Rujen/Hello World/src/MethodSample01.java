
public class MethodSample01 {

	public static void main(String[] args) {
		MethodSample01.greetings();
		MethodSample01.greetings("さくらい");
}
	public static void greetings() {
		System.out.println("ハロー");
	}
	public static void greetings(String name) {
		System.out.println("ハロー"+name+"san.");
	}

}
