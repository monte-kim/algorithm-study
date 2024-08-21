import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		List<Integer> sequence = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			sequence.add(i);
		}

		sb.append("<");
		int startIndex = -1;
		for (int i = 0; i < N; i++) {
			startIndex += K;
			startIndex %= sequence.size();
			sb.append(sequence.get(startIndex)).append(i == N - 1 ? "" : ", ");
			sequence.remove(startIndex);
			startIndex--;
		}
		sb.append(">");

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
