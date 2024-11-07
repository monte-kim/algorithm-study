import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> indexStack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while(!indexStack.isEmpty() && prices[indexStack.peek()] > prices[i]){
                int index = indexStack.pop();
                answer[index] = i - index;
            }

            indexStack.push(i);
        }

        while (!indexStack.isEmpty()) {
            int index = indexStack.pop();
            answer[index] = prices.length - index - 1;
        }

        return answer;
    }
}