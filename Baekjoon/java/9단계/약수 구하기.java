import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i != 0) {
                continue;
            }

            count++;

            if(count == k){
                sb.append(i);
                break;
            }
        }

        if(count != k){
            sb.append(0);
        }

        bw.write(sb.toString());
        bw.flush();
    }
}