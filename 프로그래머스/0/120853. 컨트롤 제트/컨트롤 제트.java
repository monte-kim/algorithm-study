class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] numbers = s.split(" ");
        for(int i = 0; i < numbers.length - 1; i++){
            if(!numbers[i].equals("Z")){
                if(!numbers[i + 1].equals("Z")){
                    answer += Integer.parseInt(numbers[i]);
                }
            }
        }

        if(!numbers[numbers.length - 1].equals("Z")){
            answer += Integer.parseInt(numbers[numbers.length - 1]);
        }

        return answer;
    }
}