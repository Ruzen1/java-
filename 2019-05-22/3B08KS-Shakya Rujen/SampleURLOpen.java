import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class SampleURLOpen {
public static void main(String[] args) throws IOException {
	String u = "https://yahoo.co.jp";
	URL url = new URL(u);
	URLConnection con = url.openConnection();
	
	InputStream is = con.getInputStream();
	BufferedReader br = new BufferedReader(new InputStreamReader(is));
	
	System.out.println("START");
	
	String line;
	String line2;
	while ((line = br.readLine())!=null) {
		if (line.matches("<title>.*")) {
			String[] aa=line.split("<title>");
			String[] bb=aa[1].split("</title>");
			System.out.println(bb[0]);
		}
		
	}
	
	System.out.println("END");
}
}
