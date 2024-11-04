import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> sums = new ArrayList<>();
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                sums.add(numbers[i] + numbers[j]);
            }
        }
        return sums.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
    }
}