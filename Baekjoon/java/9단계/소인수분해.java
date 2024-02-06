import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                sb.append(i).append("\n");
                n /= i;
            }
        }

        if (n != 1) {
            //n을 루트 n 이하의 소수들로 나눴음에도 1이 안 됐다면 그 값 또한 소수이다.
            sb.append(n).append("\n");
        }

        System.out.println(sb.toString());
    }
}