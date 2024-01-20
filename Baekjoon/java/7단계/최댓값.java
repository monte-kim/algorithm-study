import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[][] a = new int[9][9];
        StringBuilder sb = new StringBuilder();
        int max = -1, maxRow = -1, maxCol = -1;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
                if(max < a[i][j]){
                    max = a[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }

        sb.append(max).append("\n").append(maxRow).append(" ").append(maxCol);

        bw.write(sb.toString());
        bw.flush();
    }
}