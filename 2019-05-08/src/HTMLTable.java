import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class HTMLTable {
public static void main(String[] args) throws IOException {
	LocalDate today = LocalDate.now();
	File f=new File("calendar-sample01.html");
	FileWriter fw= new FileWriter(f);
	fw.write("<body style=\"padding-top:15%;padding-left:25%;\">");
	fw.write("<table border =1>");
	
	fw.write("<tr>");
	for(int i=1;i<15;i++) {
		fw.write("<td>"+
				today.plusDays(i)+ "</td>"+"  ");
		if (i%7==0) {
			fw.write("</tr>"+"<tr>");
		}
		if(i==15) {
			fw.write("<td></td><td></td>"+"<td>"+
					today.plusDays(i)+ "</td>");
			
		}
	}
	fw.write("</tr>");
	fw.write("</table>");
	fw.write("</body>");
	fw.close();
	
	
}
}