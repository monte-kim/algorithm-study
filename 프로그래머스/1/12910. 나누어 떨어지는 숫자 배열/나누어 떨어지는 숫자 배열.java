import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> dividedUp = new ArrayList<>();

        for(int number : arr){
            if(number % divisor == 0){
                dividedUp.add(number);
            }
        }

        if(dividedUp.isEmpty()){
            dividedUp.add(-1);
        }
        
        return dividedUp.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}