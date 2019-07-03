
public class SampleString05 {
public static void main(String[] args) {
	String s="yahooニュース,https://news.yahoo.co.jp/";
	String []d=s.split(",");
	System.out.println("<a href=\""+d[1]+"\">"+d[0]+"</a>");
	
}
}
