import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        char[] digits = br.readLine().toCharArray();
        int sum = 0;
        for (char digit : digits) {
            sum += digit - '0';
        }
        System.out.println(sum);
    }
}