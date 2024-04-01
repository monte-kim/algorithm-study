import java.io.*;
import java.util.*;

public class Main {
    static boolean[] prime = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        setPrime();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            for (int j = 2; j <= N / 2; j++) {
                if(prime[j] && prime[N - j]){
                    count++;
                }
            }
            sb.append(count).append("\n");
        }

        System.out.print(sb.toString());
    }

    public static void setPrime() {
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i * i <= 1000000; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    prime[j] = false;
                }
            }
        }
    }
}