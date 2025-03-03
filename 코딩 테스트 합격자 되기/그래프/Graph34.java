import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// [그래프 - 문제 34] 깊이 우선 탐색 순회
public class Graph34 {

    public static void main(String[] args) {
        int[][] graph1 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        System.out.println(Arrays.toString(solution(graph1, 1, 5)));
        int[][] graph2 = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {5, 6}};
        System.out.println(Arrays.toString(solution(graph2, 1, 6)));
    }

    private static int[] solution(int[][] graph, int start, int n) {
        ArrayList<Integer>[] adjacencyList;
        boolean[] visited;
        ArrayList<Integer> answer;

        adjacencyList = new ArrayList[n + 1];
        for (int i = 1; i < adjacencyList.length; i++) {
            adjacencyList[i] = new ArrayList<>();
        }

        for (int[] edge : graph) {
            int startNode = edge[0];
            int endNode = edge[1];
            adjacencyList[startNode].add(endNode);
        }

        visited = new boolean[n + 1];
        answer = new ArrayList<>();

        dfs(start, adjacencyList, visited, answer);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void dfs(int currentNode, List<Integer>[] adjacencyList, boolean[] visited, List<Integer> answer) {
        visited[currentNode] = true;
        answer.add(currentNode);
        for(int nextNode : adjacencyList[currentNode]){
            if(!visited[nextNode]){
                dfs(nextNode, adjacencyList, visited, answer);
            }
        }
    }
}