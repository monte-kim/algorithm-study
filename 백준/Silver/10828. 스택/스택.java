import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		List<Integer> stack = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();

			switch (command) {
				case "push":
					stack.add(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					if (stack.isEmpty()) {
						sb.append(-1);
					} else {
						sb.append(stack.get(stack.size() - 1));
						stack.remove(stack.size() - 1);
					}
					sb.append("\n");
					break;
				case "size":
					sb.append(stack.size()).append("\n");
					break;
				case "empty":
					if (stack.isEmpty()) {
						sb.append(1);
					} else {
						sb.append(0);
					}
					sb.append("\n");
					break;
				case "top":
					if (stack.isEmpty()) {
						sb.append(-1);
					} else {
						sb.append(stack.get(stack.size() - 1));
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
