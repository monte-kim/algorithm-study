import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int w = maps.length;
        int h = maps[0].length;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0, 1});
        
        boolean[][] visited = new boolean[w][h];
        
        while(!queue.isEmpty()){
            int[] position = queue.poll();
            int x = position[0];
            int y = position[1];
            int cnt = position[2];
            
            if(x == w - 1 && y == h - 1){
                return cnt;
            }
            
            for(int i = 0; i < 4; i++){
                if(x + dx[i] >= 0 && x + dx[i] < w && 
                   y + dy[i] >= 0 && y + dy[i] < h && 
                   maps[x + dx[i]][y + dy[i]] == 1 && 
                   !visited[x + dx[i]][y + dy[i]]){
                    visited[x + dx[i]][y + dy[i]] = true;
                    queue.offer(new int[]{x + dx[i], y + dy[i], cnt + 1});
                }
            }
        }
        
        return -1;
    }
}