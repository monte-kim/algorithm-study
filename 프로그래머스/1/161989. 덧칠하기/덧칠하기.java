class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 1;
        int firstColoredWall = section[0]; // 페인트 시작 지점
        
        for(int i = 0; i < section.length ; i++){
            int lastColoredWall = firstColoredWall + m - 1;
            if(section[i] <= lastColoredWall){ // 다음 허물어진 벽이 페인트 마지막 지점 이전이라면
                continue;
            } else{
                firstColoredWall = section[i];
                count++;
            }
        }
        
        return count;
    }
}