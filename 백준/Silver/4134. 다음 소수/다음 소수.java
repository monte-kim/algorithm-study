import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long N = Long.parseLong(br.readLine());

        for (long i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());

            while (true) {
                boolean isPrime = true;

                if (num == 0 || num == 1 || num == 2) {
                    sb.append(2).append("\n");
                    break;
                }

                for (long j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                
                if (isPrime) {
                    sb.append(num).append("\n");
                    break;
                }
                num++;
            }
        }

        System.out.println(sb);
    }
}