import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int x, y;

        // 문제에서 방정식을 만족하는 (x, y)가 유일하게 존재한다고 했으므로 분모가 0이 되는 경우는 고려하지 않아도 된다.
        // x, y를 각각 소거법으로 구한다.
        x = (c * e - b * f) / (a * e - b * d);
        y = (c * d - a * f) / (b * d - a * e);

        System.out.printf("%d %d", x, y);
    }
}