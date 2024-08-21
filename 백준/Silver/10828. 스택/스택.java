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
			if (command.contains("push")) {
				stack.add(Integer.parseInt(st.nextToken()));
				continue;
			} else if (command.contains("pop")) {
				if (stack.isEmpty()) {
					sb.append(-1);
				} else {
					sb.append(stack.get(stack.size() - 1));
					stack.remove(stack.size() -1);
				}
			} else if (command.contains("size")) {
				sb.append(stack.size());
			} else if (command.contains("empty")) {
				if (stack.isEmpty()) {
					sb.append(1);
				} else {
					sb.append(0);
				}
			} else if (command.contains("top")) {
				if (stack.isEmpty()) {
					sb.append(-1);
				} else {
					sb.append(stack.get(stack.size() - 1));
				}
			}
			sb.append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
