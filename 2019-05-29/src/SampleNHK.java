import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class SampleNHK {
public static void main(String[] args) throws IOException {
	String u = "https://www3.nhk.or.jp/rss/news/cat0.xml";
	URL url = new URL(u);
	java.net.URLConnection con = url.openConnection();
	
	InputStream is = con.getInputStream();
	BufferedReader br = new BufferedReader(new InputStreamReader(is));
	
	
	
	File f = new File("SampleNHK.csv");
	FileOutputStream fos = new FileOutputStream(f);
	PrintStream out = new PrintStream(fos);
	out.println("START");
	String line;
	String line2;
	int i=1;
	while ((line = br.readLine())!=null) {
	
		if (line.matches("<title>.*")) {
			String[] aa=line.split("<title>");
			String[] bb=aa[1].split("</title>");
			out.println("Title="+bb[0]);
		}
		if(line.matches("<item>.*")) {
			out.println("Item "+ i);
			i++;
		}
		if (line.matches("<link>.*")) {
			String[] cc=line.split("<link>");
			String[] dd=cc[1].split("</link>");
			out.println("Link="+dd[0]);
		}
		if (line.matches("<description>.*")) {
			String[] ee=line.split("<description>");
			String[] ff=ee[1].split("</description>");
			out.println("Description="+ff[0]+("\n"));
		}
	}
	
out.println("END");
}

}
