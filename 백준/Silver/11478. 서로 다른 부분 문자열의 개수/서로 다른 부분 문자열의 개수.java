import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            String endLine = S.substring(i + 1);
            for (int j = i + 1; j <= S.length(); j++) {
                String word = S.substring(i, j);
                if (!endLine.contains(word)) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}