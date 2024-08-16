import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());

		sb.append(gcd(a, b));
		sb.append("\n");
		sb.append(a * b / gcd(a, b));

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	public static long gcd(long a, long b){
		if(b != 0)
			return gcd(b, a % b);
		else
			return a;
	}
}