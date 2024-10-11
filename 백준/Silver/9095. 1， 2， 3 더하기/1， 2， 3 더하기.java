import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] sum = new int[11];
        sum[1] = 1;
        sum[2] = 2;
        sum[3] = 4;
        for(int i = 4; i <= 10; i++){
            sum[i] = sum[i - 1] + sum[i - 2] + sum[i - 3];
        }

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            sb.append(sum[N]).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}