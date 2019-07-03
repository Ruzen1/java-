import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SampleFile02 {
public static void main(String[] args) throws IOException {
	File file = new File("link.html");
	FileWriter fw = new FileWriter(file);
	
	
	
	System.out.println("終了");
	String s="yahooニュース,https://news.yahoo.co.jp/";
	String []d=s.split(",");
	fw.write("<a href=\""+d[1]+"\">"+d[0]+"</a>");
	fw.close();
}
}
