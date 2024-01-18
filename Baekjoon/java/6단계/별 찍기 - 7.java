import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            sb.append(" ".repeat(n - i - 1));
            sb.append("*".repeat(2 * i + 1));
            sb.append("\n");
        }
        for(int i = n; i < 2 * n - 1; i++){
            sb.append(" ".repeat(i - n + 1));
            sb.append("*".repeat(2 * n - 1 - 2 * (i - n + 1)));
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}