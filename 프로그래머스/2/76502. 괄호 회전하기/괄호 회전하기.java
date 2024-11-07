import java.util.*;

class Solution {
    public int solution(String s) {
        int matchCount = 0;
        int length = s.length();
        s += s;

        for(int i = 0; i < length; i++){
            char[] letters = s.substring(i, i + length).toCharArray();
            if(matchPair(letters)){
                matchCount++;
            }
        }

        return matchCount;
    }
    
    boolean matchPair(char[] letters){
        Stack<Character> stacks = new Stack<>();
        for(char letter: letters){
            switch(letter){
                case ')':
                    if(stacks.isEmpty() || stacks.pop() != '('){
                        return false;
                    }
                    break;
                case ']':
                    if(stacks.isEmpty() || stacks.pop() != '['){
                        return false;
                    }
                    break;
                case '}':
                    if(stacks.isEmpty() || stacks.pop() != '{'){
                        return false;
                    }
                    break;
                case '(':
                case '[':
                case '{':
                    stacks.push(letter);
                    break;
                default:
                    break;
            }
        }

        return stacks.isEmpty();
    }
}