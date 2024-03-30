import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];
        int gcdDistance = 0;

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N - 1; i++) {
            int distance = trees[i + 1] - trees[i];
            gcdDistance = gcd(gcdDistance, distance);
        }

        System.out.println((trees[N - 1] - trees[0]) / gcdDistance + 1 - N);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}