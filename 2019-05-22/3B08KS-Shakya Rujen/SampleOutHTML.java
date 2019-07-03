import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SampleOutHTML {
public static void main(String[] args) throws IOException {
	File f = new File("index.html");
	FileWriter fw= new FileWriter(f);
	fw.write("<h1>It works.</h1>");
	fw.close();
}
}
