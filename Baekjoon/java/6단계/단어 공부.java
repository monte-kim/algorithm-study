import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabets = new int[26];
        int max = 0;
        int maxChar = 0;

        char[] word = br.readLine().toUpperCase().toCharArray();

        for (char letter : word) {
            alphabets[letter - 'A']++;
        }

        for (int i = 0; i < alphabets.length; i++) {
            if(alphabets[i] > max){
                max = alphabets[i];
                maxChar = i + 'A';
            } else if(alphabets[i] == max){
                maxChar = '?';
            }
        }

        System.out.println((char)maxChar);
    }
}