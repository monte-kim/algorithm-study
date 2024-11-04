import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] answers) {
        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int maxScore = Integer.MIN_VALUE;
        int[] scores = new int[3];
        for (int i = 0; i < 3; i++) {
            int scored = 0;

            for (int j = 0; j < answers.length; j++) {
                int[] currentPattern = patterns[i];
                if (currentPattern[j % (currentPattern.length)] == answers[j]) {
                    scored++;
                }
            }

            scores[i] = scored;
            if (scored > maxScore) maxScore = scored;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}