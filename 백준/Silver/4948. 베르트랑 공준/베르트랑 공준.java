import java.io.*;
import java.util.*;

public class Main {
    static boolean[] prime = new boolean[123456 * 2 + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N;

        setPrime();

        while ((N = Integer.parseInt(br.readLine())) != 0) {
            int count = 0;
            for (int i = N + 1; i <= N * 2; i++) {
                if (prime[i]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }

    public static void setPrime() {
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i * i <= 123456 * 2; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= 123456 * 2; j += i) {
                    prime[j] = false;
                }
            }
        }
    }
}