import java.io.*;
import java.util.*;

//public class Main {
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] scores = new int[n];
        double sum  = 0;
        int maxScore = 0;

        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if (maxScore < scores[i]){
                maxScore = scores[i];
            }
        }

        for (int score : scores) {
            sum += (double)score / maxScore * 100;
        }

        sb.append(sum / n);

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}