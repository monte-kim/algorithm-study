import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int left = x;
        int bottom = y;
        int right = w - x;
        int top = h - y;

        int topBottomMin = Math.min(bottom, top);
        int leftRightMin = Math.min(left, right);
        int totalMin = Math.min(topBottomMin, leftRightMin);

        System.out.println(totalMin);
    }
}