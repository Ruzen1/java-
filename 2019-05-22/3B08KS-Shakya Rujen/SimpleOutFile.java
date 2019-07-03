import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleOutFile {
public static void main(String[] args) throws IOException {
	File file = new File("HelloWorld.txt");
	FileWriter fw = new FileWriter(file);
	for(int i = 0;i<10;i++) {
		fw.write("Hello world");
	}
	
	fw.close();
	System.out.println("I—¹");
	}

}

