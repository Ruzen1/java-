import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class SampleInputHTML {
public static void main(String[] args) throws IOException {
	File f=new File("index.html");
	FileReader fr= new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	PrintWriter out = new PrintWriter(System.out);
	
	String line;
	while((line = br.readLine())!=null) {
		out.print(line);
	}
	
	out.flush();
	out.close();
	br.close();
	System.out.println("end");
}

}
