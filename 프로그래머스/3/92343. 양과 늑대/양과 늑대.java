import java.util.*;

class Solution {
    ArrayList<Integer>[] graph;
    int maxSheep = 0;
    
    public int solution(int[] info, int[][] edges) {
//        maxSheep = 0;
        graph = new ArrayList[info.length];

        for (int i = 0; i < info.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
        }

        ArrayList<Integer> initialNodes = new ArrayList<>();
        initialNodes.add(0);
        dfs(0, 0, 0, initialNodes, info);

        return maxSheep;
    }

    /*
     * nodeIndex: 현재 노드의 인덱스
     * currentSheeps: 현재까지 모은 양
     * currentWolves: 현재까지 따라오고 있는 늑대
     * nextNodes: 다음 방문할 노드들
     * info: 각 노드가 양인지 늑대인지 저장해둔 정보 배열
     */
    public void dfs(int nodeIndex, int currentSheeps, int currentWolves, List<Integer> nodesToSearch, int[] info){
        if(info[nodeIndex] == 0) {
            currentSheeps++;
        } else {
            currentWolves++;
        }

        if(currentSheeps <= currentWolves){
            return;
        }

        maxSheep = Math.max(maxSheep, currentSheeps);

        ArrayList<Integer> nextNodes = new ArrayList<>(nodesToSearch);
        Integer nodeIndexInteger = nodeIndex;
        nextNodes.remove(nodeIndexInteger);
        nextNodes.addAll(graph[nodeIndex]);

        for(Integer nextNode : nextNodes){
            dfs(nextNode, currentSheeps, currentWolves, nextNodes, info);
        }
    }
}