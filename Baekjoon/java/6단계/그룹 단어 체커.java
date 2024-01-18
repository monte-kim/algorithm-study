import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = n;

        for (int i = 0; i < n; i++) {
            char[] letters = br.readLine().toCharArray();
            char prev = letters[0];
            boolean[] alphabetCheck = new boolean[26];
            for (char letter : letters) {
                if (prev != letter) {
                    if (alphabetCheck[letter - 'a']) {
                        count--;
                        break;
                    } else {
                        alphabetCheck[prev - 'a'] = true;
                        prev = letter;
                    }
                }
            }
        }

        System.out.print(count);
    }
}