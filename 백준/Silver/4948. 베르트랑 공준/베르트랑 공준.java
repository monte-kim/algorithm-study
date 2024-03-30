import java.io.*;
import java.util.*;

public class Main {
    static boolean[] prime = new boolean[123456 * 2 + 1];
    static int[] primeCounts = new int[123456 * 2 + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N;

        setPrime();
        setPrimeCounts();

        while ((N = Integer.parseInt(br.readLine())) != 0) {
            sb.append((primeCounts[N * 2] - primeCounts[N])).append("\n");
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

    public static void setPrimeCounts(){
        int count = 0;
        for (int i = 0; i <= 123456 * 2; i++) {
            if (prime[i]) {
                count++;
            }
            primeCounts[i] = count;
        }
    }
}