import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        Stack<Integer> numbers = new Stack<>();
        for(String unit : s.split(" ")){
            if(unit.equals("Z")){
                numbers.pop();
            } else {
                numbers.push(Integer.valueOf(unit));
            }
        }

        while(!numbers.isEmpty()){
            answer += numbers.pop();
        }

        return answer;
    }
}