import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int a, b;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) break;

            if (b % a == 0) {
                sb.append("factor");
            } else if (a % b == 0) {
                sb.append("multiple");
            } else {
                sb.append("neither");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}