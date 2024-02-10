import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 & c == 0) {
                break;
            }

            if ((a + b <= c) || (b + c <= a) || (c + a <= b)) {
                sb.append("Invalid");
            } else if (a == b & b == c) {
                sb.append("Equilateral");
            } else if (a != b && b != c && c != a) {
                sb.append("Scalene");
            } else {
                sb.append("Isosceles");
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}