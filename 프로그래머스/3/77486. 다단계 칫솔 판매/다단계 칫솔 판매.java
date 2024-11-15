import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        HashMap<String, String> relation = new HashMap<>();
        for (int i = 0; i < enroll.length; i++) {
            relation.put(enroll[i], referral[i]);
        }

        HashMap<String, Integer> income = new HashMap<>();
        for (int i = 0; i < amount.length; i++) {
            int salesRevenue = amount[i] * 100;

            String nextReferral = seller[i];
            int profitLeft = salesRevenue;
            while (profitLeft > 0 && !nextReferral.equals("-")) {
                int myProfit = (int) Math.ceil(profitLeft * 0.9);
                profitLeft = profitLeft - myProfit;
                income.put(nextReferral, income.getOrDefault(nextReferral, 0) + myProfit);
                nextReferral = relation.get(nextReferral);
            }
        }

        int[] answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            answer[i] = income.getOrDefault(enroll[i], 0);
        }

        return answer;
    }
}