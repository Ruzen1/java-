import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSample {
	public static void main(String[] args) throws IOException {
	File file = new File("sample-0.txt");
	FileWriter fw = new FileWriter(file);
	fw.write("Hello world");
	
	fw.close();
	System.out.println("終了");
	
	}

}
