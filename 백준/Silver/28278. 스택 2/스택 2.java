import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int command = Integer.parseInt(st.nextToken());
            if (command == 1) {
                int num = Integer.parseInt(st.nextToken());
                result.add(num);
            } else {
                if (command == 2) {
                    sb.append(result.size() == 0 ? -1 : result.pop());
                } else if (command == 3) {
                    sb.append(result.size());
                } else if (command == 4) {
                    sb.append(result.size() == 0 ? 1 : 0);
                } else {
                    sb.append(result.size() == 0 ? -1 : result.peek());
                }
                sb.append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();

        br.close();
        bw.close();
    }
}