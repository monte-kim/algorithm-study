import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int removedCommentsCount = (int)Math.round(n * 0.15);
		List<Integer> comments = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			comments.add(Integer.parseInt(br.readLine()));
		}
		comments.sort(null);

		int sum = 0;
		for (int i = removedCommentsCount; i < comments.size() - removedCommentsCount; i++) {
			sum += comments.get(i);
		}
		int avg = Math.round((float)sum / (comments.size() - 2 * removedCommentsCount));

		bw.write(String.valueOf(avg));
		bw.flush();
		bw.close();
		br.close();
	}
}