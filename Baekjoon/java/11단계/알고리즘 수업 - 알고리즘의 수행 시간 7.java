import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if (a1 * n0 + a0 <= c * n0 && a1 <= c) { //c가 이미 양의 정수인데, a1 > c이면 a1도 양의 정수가 되고, a0의 값에 따라 항상 참이 될 수는 없다.
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}