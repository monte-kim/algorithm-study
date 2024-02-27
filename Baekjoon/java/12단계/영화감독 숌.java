import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int series = Integer.parseInt(br.readLine());
        int count = 0, i = 666;

        while (count != series) {
            if (Integer.toString(i).contains("666")) {
                count++;
            }
            i++;
        }

        System.out.println(--i);
    }
}