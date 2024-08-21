import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int removedCommentsCount = (int)Math.round(n * 0.15);
		int[] comments = new int[n];

		for (int i = 0; i < n; i++) {
			comments[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(comments);

		int sum = 0;
		for (int i = removedCommentsCount; i < comments.length - removedCommentsCount; i++) {
			sum += comments[i];
		}
		int avg = Math.round((float)sum / (comments.length - 2 * removedCommentsCount));

		bw.write(String.valueOf(avg));
		bw.flush();
		bw.close();
		br.close();
	}
}