import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringBuilder temp;
        int n, sum;

        while ((n = Integer.parseInt(br.readLine())) != -1) {
            sum = 0;
            temp = new StringBuilder();
            temp.append(n).append(" = ");

            for (int i = 1; i <= n / 2; i++) {
                if (n % i != 0) {
                    continue;
                }
                sum += i;
                temp.append(i).append(" + ");
            }

            if (sum != n) {
                sb.append(n).append(" is NOT perfect.");
            } else {
                int len = temp.length();
                temp.delete(len - 3, len);
                sb.append(temp);
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}