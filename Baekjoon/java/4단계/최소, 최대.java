import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        int min = Integer.parseInt(st.nextToken());
        int max = min;

        for (int i = 1; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        System.out.print(min + " " + max);
    }
}