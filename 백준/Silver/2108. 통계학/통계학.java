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
		StringBuilder sb = new StringBuilder();
		List<Integer> numbers = new ArrayList<>();

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			numbers.add(Integer.parseInt(br.readLine()));
		}

		numbers.sort(null);

		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		sb.append(Math.round((double)sum / N)).append("\n");

		int mid = numbers.get(N / 2);
		sb.append(mid).append("\n");

		int[] count = new int[8001];
		for (int number : numbers) {
			count[number + 4000]++;
		}

		int max = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i] > max) {
				max = count[i];
			}
		}

		List<Integer> mostList = new ArrayList<>();
		for (int i = 0; i < count.length; i++) {
			if (count[i] == max) {
				mostList.add(i - 4000);
			}
		}

		if (mostList.size() < 2)
			sb.append(mostList.get(0));
		else
			sb.append(mostList.get(1));
		sb.append("\n");

		sb.append(numbers.get(numbers.size() - 1) - numbers.get(0));

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}