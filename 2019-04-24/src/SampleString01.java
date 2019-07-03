
public class SampleString01 {
 public static void main(String[] args) {
	String str= "さくらい,ノヤマ,nakai";
	String[] names = str.split(",");
	System.out.println("<ul>");
	for (String ruzen: names) {
		System.out.println("<li>"+ruzen);
	}
	System.out.println("</ul>");
}
}
