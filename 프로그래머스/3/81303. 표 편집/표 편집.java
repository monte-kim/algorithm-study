import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {
        int size = n;
        int currentIndex = k;
        Stack<Integer> trashcan = new Stack<>(); // trashcan에 남아있는 id에만 "X" 표시 하면 됨
        for (String c : cmd) {
            switch (c.split(" ")[0]) {
                case "U":
                    currentIndex -= Integer.parseInt(c.split(" ")[1]);
                    break;
                case "D":
                    currentIndex += Integer.parseInt(c.split(" ")[1]);
                    break;
                case "C":
                    trashcan.push(currentIndex);
                    size--;
                    if (currentIndex == size) {
                        currentIndex--;
                    }
                    break;
                case "Z":
                    int rollback = trashcan.pop();
                    if(rollback <= currentIndex){
                        currentIndex++;
                    }
                    size++;
                    break;
                default:
                    break;
            }
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n - trashcan.size(); i++){
            result.append("O");
        }
        while(!trashcan.isEmpty()){
            result.insert(trashcan.pop(), "X");
        }

        return result.toString();
    }
}