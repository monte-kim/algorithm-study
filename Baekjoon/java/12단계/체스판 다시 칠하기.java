import java.io.*;
import java.util.*;

public class Main {
    private static String WHITE_START = "WBWBWBWB";
    private static String BLACK_START = "BWBWBWBW";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        char[][] board = new char[m][n];
        char start;
        int minimumResult = Integer.MAX_VALUE;
        int result;

        for (int i = 0; i < m; i++) {
            char[] boardLine = br.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                board[i][j] = boardLine[j];
            }
        }

        // 시작 지점은 board[i][j]
        for (int i = 0; i < m - 7; i++) {
            for (int j = 0; j < n - 7; j++) {
                // W 또는 B로 시작하는 2가지 경우
                for (int k = 0; k < 2; k++) {
                    start = k == 0 ? 'W' : 'B';
                    result = 0;
                    for (int l = i; l < i + 8; l++) {
                        for (int o = j; o < j + 8; o++) {
                            if (board[l][o] != start) {
                                result++;
                            }
                            start = start == 'W' ? 'B' : 'W';
                        }
                        start = start == 'W' ? 'B' : 'W';
                    }
                    minimumResult = Math.min(result, minimumResult);
                }
            }
        }

        System.out.println(minimumResult);
    }
}