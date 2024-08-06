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
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int totalScore = 0;
			int scoreToAdd = 0;
			char[] checkedAnswers = br.readLine().toCharArray();

			for (char checkedAnswer : checkedAnswers) {
				if (checkedAnswer == 'X') {
					scoreToAdd = 0;
				} else {
					scoreToAdd += 1;
					totalScore += scoreToAdd;
				}
			}

			sb.append(totalScore);
			sb.append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}