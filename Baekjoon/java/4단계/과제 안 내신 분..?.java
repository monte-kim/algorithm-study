import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int[] students = new int[30];

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            students[num - 1] = num;
        }

        for (int i = 0; i < 30; i++) {
            if (students[i] == 0) {
                sb.append(i + 1).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}