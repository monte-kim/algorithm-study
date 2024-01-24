import java.io.*;
import java.util.*;

public class Main {
    private static final int BOARD_LENGTH = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int last = 1;

        while (last < n) {
            count++;
            last += 6 * (count - 1);
        }

        System.out.println(count);
    }
}