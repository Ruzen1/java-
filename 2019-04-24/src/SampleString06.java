
public class SampleString06 {
public static void main(String[] args) {
	String lines="yahooニュース,https://news.yahoo.co.jp/\n"+"yahoo路線.https://trasnit.yahoo.co.jp/\n"+"yahoo地図.https://map.yahoo.co.jp/\n";
	System.out.println("<ul>");
	for (String line: lines.split("\n")){
		for(String a: line.split(",")) {
			System.out.println(a);
		}
		}
	System.out.println("</ul>");
}}
