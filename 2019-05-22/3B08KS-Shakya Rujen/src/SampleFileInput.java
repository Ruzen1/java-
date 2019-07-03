import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SampleFileInput {
	public static void main(String[] args) throws IOException {
		File f = new File("HelloWorld.txt");
		FileWriter fw=new FileWriter("HelloWorld.txt",true);
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File("Helloooooo.txt"))));
		String line;		
		//for (int i=0;i<10;i++) {
			//line=br.readLine();
			//System.out.println(line);
		//}
		
		while((line=br.readLine())!=null){
				out.println(line);	
}		
		br.close();
		System.out.println("end");
		
	}
}


