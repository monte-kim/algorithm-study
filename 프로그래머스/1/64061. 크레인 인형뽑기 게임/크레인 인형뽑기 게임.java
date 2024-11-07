import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> pickedDolls = new Stack<>();
        int count = 0;

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    int pickedDoll = board[i][move - 1];

                    if (!pickedDolls.isEmpty() && pickedDolls.peek() == pickedDoll) {
                        pickedDolls.pop();
                        count++;
                        count++;
                    } else {
                        pickedDolls.push(pickedDoll);
                    }

                    board[i][move - 1] = 0;
                    break;
                }
            }
        }

        return count;
    }
}