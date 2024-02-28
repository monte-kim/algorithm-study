import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int bags = 0;

        for (int i = N / 5; i >= 0; i--) {
            if ((N - i * 5) % 3 == 0) {
                bags = i + (N - i * 5) / 3;
                break;
            }
        }
        System.out.println(bags == 0 ? -1 : bags);
    }
}