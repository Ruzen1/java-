import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class CreateHTML02 {
public static void main(String[] args) throws IOException {
	LocalDate today= LocalDate.now();
	File f=new File("sample02.html");
	FileWriter fw= new FileWriter(f);
	fw.write("<ul>");
	for (int i=0;i<21;i++) {
		fw.write("<li>"+today.plusDays(i)+"</li>");
	}
	fw.write("</ul>");
	fw.close();
	}

}
