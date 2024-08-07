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

		int people = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");
		List<Integer> sizes = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			sizes.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine(), " ");
		int T = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		int totalTShirts = 0;
		for (int size : sizes) {
			totalTShirts += size / T;
			if (size % T != 0) {
				totalTShirts++;
			}
		}
		sb.append(totalTShirts);
		sb.append("\n");

		int groupOfPens = people / P;
		int singlePens = people % P;
		sb.append(groupOfPens);
		sb.append(" ");
		sb.append(singlePens);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}