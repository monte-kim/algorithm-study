import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

// [그래프 - 문제 35] 너비 우선 탐색 순회
public class Graph35 {

    private static ArrayList<Integer>[] adjacencyList;
    private static boolean[] visited;
    private static ArrayList<Integer> answer;

    public static void main(String[] args) {
        int[][] graph1 = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3, 7}, {4, 8}, {5, 8}, {6, 9}, {7, 9}};
        System.out.println(Arrays.toString(solution(graph1, 1, 9)));
        int[][] graph2 = {{1, 3}, {3, 4}, {3, 5}, {5, 2}};
        System.out.println(Arrays.toString(solution(graph2, 1, 5)));
    }

    private static int[] solution(int[][] graph, int start, int n) {
        adjacencyList = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        answer = new ArrayList<>();

        for (int i = 0; i < adjacencyList.length; i++) {
            adjacencyList[i] = new ArrayList<>();
        }

        for (int[] edges : graph) {
            int startNode = edges[0];
            int endNode = edges[1];
            adjacencyList[startNode].add(endNode);
        }

        bfs(start);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void bfs(int start) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            answer.add(currentNode);
            for (int nextNode : adjacencyList[currentNode]) {
                if (!visited[nextNode]) {
                    queue.add(nextNode);
                    visited[nextNode] = true;
                }
            }
        }
    }
}