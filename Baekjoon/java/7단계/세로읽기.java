import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        char[][] letters = new char[5][15];

        for (int i = 0; i < 5; i++) {
            char[] inputSingleRow = br.readLine().toCharArray();
            for(int j = 0; j < inputSingleRow.length; j++){
                letters[i][j] = inputSingleRow[j];
            }
        }

        for(int j = 0; j < 15; j++){
            for(int i = 0; i < 5; i++){
                if(letters[i][j] == '\u0000'){
                    continue;
                }
                sb.append(letters[i][j]);
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}