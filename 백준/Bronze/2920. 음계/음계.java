import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		List<Integer> notes = new ArrayList<>();
		List<Integer> ascendingNotes = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		List<Integer> descendingNotes = new ArrayList<>(Arrays.asList(8, 7, 6, 5, 4, 3, 2, 1));

		for(int i = 0; i < 8; i++){
			notes.add(Integer.parseInt(st.nextToken()));
		}

		if(notes.equals(ascendingNotes))
			sb.append("ascending");
		else if(notes.equals(descendingNotes))
			sb.append("descending");
		else
			sb.append("mixed");

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}