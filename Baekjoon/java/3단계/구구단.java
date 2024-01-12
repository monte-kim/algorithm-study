package stage3;

import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < 10; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(n).append(" * ").append(i).append(" = ").append(n * i).append("\n");
            bw.write(sb.toString());
        }
        br.close();
        bw.flush();
        bw.close();
    }
}