import java.io.*;
import java.util.*;

public class Main {
    private static final int BOARD_LENGTH = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int length = (int) Math.pow(2, n) + 1;
        int result = (int) Math.pow(length, 2);

        System.out.println(result);
    }
}