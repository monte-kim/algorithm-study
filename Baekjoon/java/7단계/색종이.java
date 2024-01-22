import java.io.*;
import java.util.*;

public class Main {
    private static final int BOARD_LENGTH = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int lines = Integer.parseInt(br.readLine());
        int[][] board = new int[BOARD_LENGTH][BOARD_LENGTH];
        int count = 0;

        for (int i = 0; i < lines; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x + 10; j++){
                for(int k = y; k < y + 10; k++){
                    if(board[j][k] == 1){
                        continue;
                    }

                    count++;
                    board[j][k] = 1;
                }
            }
        }

        System.out.print(count);

    }
}