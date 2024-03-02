import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Integer[] numbers = new Integer[5];
        double sum = 0;

        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
        }

        Arrays.sort(numbers);

        sum /= 5;
        if (sum == (int)sum) sb.append((int)sum);
        else sb.append(sum);
        sb.append('\n').append(numbers[2]);
        System.out.println(sb.toString());
    }
}