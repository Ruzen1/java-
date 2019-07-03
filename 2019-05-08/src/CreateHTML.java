import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateHTML {
public static void main(String[] args) throws IOException {
	File f = new File("sample01.html");
	FileWriter fw = new FileWriter(f);
	fw.write("<h1>It Works.</h1>");
	fw.close();
}
}
