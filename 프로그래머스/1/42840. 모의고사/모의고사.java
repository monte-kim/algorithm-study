import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] answers) {int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int maxScore = Integer.MIN_VALUE;
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < patterns.length; i++) {
            int scored = 0;

            for (int j = 0; j < answers.length; j++) {
                int[] currentPattern = patterns[i];
                if (currentPattern[j % currentPattern.length] == answers[j]) {
                    scored++;
                }
            }

            scores.add(scored);
            if (scored > maxScore) maxScore = scored;
        }

        // scores에서 maxScore와 같은 값을 가진 요소의 index를 찾아서 출력한다.
        int finalMaxScore = maxScore;
        return IntStream.range(0, scores.size())
                .filter(i -> scores.get(i) == finalMaxScore)
                .map(i -> i + 1)
                .toArray();
    }
}