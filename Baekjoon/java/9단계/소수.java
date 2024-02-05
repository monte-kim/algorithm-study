import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int firstPrime = 0;
        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = true; //false가 소수

        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) { //i가 소수이면
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = true; //i의 배수는 소수 아님
                }
            }
        }

        for (int i = m; i <= n; i++) {
            if (!prime[i]) {
                sum += i;
                if(firstPrime == 0){
                    firstPrime = i;
                }
            }
        }

        if (firstPrime == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(firstPrime);
        }
    }
}