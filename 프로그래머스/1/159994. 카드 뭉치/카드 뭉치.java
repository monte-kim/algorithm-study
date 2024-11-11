import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        Queue<String> queueCards1 = new ArrayDeque<>();
        for(String word : cards1){
            queueCards1.add(word);
        }
        
        Queue<String> queueCards2 = new ArrayDeque<>();
        for(String word : cards2){
            queueCards2.add(word);
        }
        
        for(String word : goal){
            if(word.equals(queueCards1.peek())){
                queueCards1.poll();
            } else if(word.equals(queueCards2.peek())){
                queueCards2.poll();
            } else{
                return "No";
            }
        }
        
        return "Yes";
    }
}