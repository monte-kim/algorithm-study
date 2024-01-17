import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);
        for (char c : s.toCharArray()) {
            if (alphabets[c - 'a'] == -1) {
                alphabets[c - 'a'] = s.indexOf(c);
            }
        }
        for (int i : alphabets) {
            sb.append(i).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}