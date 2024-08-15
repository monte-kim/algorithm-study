import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	private static char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
		'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int r = 31;
		int M = 1234567891;
		int result = 0;

		int L = Integer.parseInt(br.readLine());
		char[] letters = br.readLine().toCharArray();

		for (int i = 0; i < L; i++) {
			int index = (int)letters[i] - 96;
			result += index * (int)Math.pow(r, i);
		}

		bw.write(String.valueOf(result % M));
		bw.flush();
		bw.close();
		br.close();
	}
}