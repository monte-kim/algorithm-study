import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		Deque<Integer> queue = new ArrayDeque<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();

			switch (command) {
				case "push":
					queue.add(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					if (queue.isEmpty()) {
						sb.append(-1);
					} else {
						sb.append(queue.poll());
					}
					sb.append("\n");
					break;
				case "size":
					sb.append(queue.size()).append("\n");
					break;
				case "empty":
					if (queue.isEmpty()) {
						sb.append(1);
					} else {
						sb.append(0);
					}
					sb.append("\n");
					break;
				case "front":
					if (queue.isEmpty()) {
						sb.append(-1);
					} else {
						sb.append(queue.peekFirst());
					}
					sb.append("\n");
					break;
				case "back":
					if (queue.isEmpty()) {
						sb.append(-1);
					} else {
						sb.append(queue.peekLast());
					}
					sb.append("\n");
					break;
				default:
					break;
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
