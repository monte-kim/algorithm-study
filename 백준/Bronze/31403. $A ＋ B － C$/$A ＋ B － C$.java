import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();

		sb.append(Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c));
		sb.append("\n");
		sb.append(Integer.parseInt(a + b) - Integer.parseInt(c));

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}