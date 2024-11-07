import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Integer> parentheses = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                parentheses.push(1);
            } else{
                if(parentheses.isEmpty()){
                    return false;
                }
                parentheses.pop();
            }
        }

        return parentheses.isEmpty();
    }
}