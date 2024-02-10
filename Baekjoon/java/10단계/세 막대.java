import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> lines = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            lines.add(Integer.parseInt(st.nextToken()));
        }

        int maxLength = Collections.max(lines);
        lines.remove(lines.indexOf(maxLength));
        int sum = lines.get(0) + lines.get(1);

        if (maxLength >= sum) {
            System.out.println(sum * 2 - 1);
        } else {
            System.out.println(sum + maxLength);
        }
    }
}