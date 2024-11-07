import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer>[] dolls = new Stack[board.length];

        for (int i = 0; i < board.length; i++) {
            dolls[i] = new Stack<>();
        }

        for (int i = board.length - 1; i >= 0; i--) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != 0) {
                    dolls[j].push(board[i][j]);
                }
            }
        }

        Stack<Integer> pickedDolls = new Stack<>();
        int count = 0;

        for (int move : moves) {
            if (!dolls[move - 1].isEmpty()) {
                int pickedDoll = dolls[move - 1].pop();

                if (!pickedDolls.isEmpty() && pickedDolls.peek() == pickedDoll) {
                    pickedDolls.pop();
                    count++;
                    count++;
                } else {
                    pickedDolls.push(pickedDoll);
                }
            }
        }
        
        return count;
    }
}