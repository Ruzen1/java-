import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SamoleSystemInput {
public static void main(String[] args) throws IOException
{
	InputStream ins = System.in;
	InputStreamReader isr = new InputStreamReader(ins);
	BufferedReader br= new BufferedReader(isr);

	String line;
	while (( line = br.readLine ())!=null) {
		System.out.println("“ü—Í='"+line+"");
}
}
}
