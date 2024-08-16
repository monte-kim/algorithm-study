import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int r = 31;
		long M = 1234567891;
		long result = 0;
		long powValue = 1;

		int L = Integer.parseInt(br.readLine());
		String word = br.readLine();

		for (int i = 0; i < L; i++) {
			result += (word.charAt(i) - 96) * powValue;
			powValue = powValue * r % M;
		}

		result %= M;

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}