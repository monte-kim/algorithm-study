import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coins = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            coins[N - i - 1] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            int coin = coins[i];

            if (coin <= K) {
                count += K / coin;
                K %= coin;
            }
            if (K == 0) {
                break;
            }
        }

        System.out.println(count);
        br.close();
    }
}