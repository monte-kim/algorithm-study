import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.valueOf(br.readLine());
        for (int i = 0; i < t; i++) {
            char[] str = br.readLine().toCharArray();
            int len = str.length;
            sb.append(str[0]).append(str[len - 1]).append("\n");
        }
        System.out.print(sb.toString());
    }
}