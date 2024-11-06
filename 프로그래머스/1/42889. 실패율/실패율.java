import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> failureRate = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            int failed = 0; // i 단계에 머무르는 인원 수
            int succeeded = 0; // i 단계 통과한 인원 수
            for (int stage : stages) {
                if (stage == i) {
                    failed++;
                }
                if (stage > i) {
                    succeeded++;
                }
            }
            failureRate.put(i, (double) failed / (failed + succeeded == 0 ? 1.0 :(failed + succeeded)));
        }

        return failureRate.entrySet().stream().sorted((o1, o2) -> {
            if(o2.getValue().equals(o1.getValue())){
                return o1.getKey() - o2.getKey();
            }
            return o2.getValue().compareTo(o1.getValue());
        }).mapToInt(Map.Entry::getKey).toArray();
    }
}