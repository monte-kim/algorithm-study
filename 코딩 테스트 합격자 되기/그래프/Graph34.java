import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Graph34 {

    private static ArrayList<Integer>[] adjacencyList;
    private static boolean[] visited;
    private static ArrayList<Integer> answer;

    public static void main(String[] args) {
        int[][] graph1 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        System.out.println(Arrays.toString(solution(graph1, 1, 5)));
        int[][] graph2 = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {5, 6}};
        System.out.println(Arrays.toString(solution(graph2, 1, 6)));
    }

    private static int[] solution(int[][] graph, int start, int nodes) {
        adjacencyList = new ArrayList[nodes + 1];
        visited = new boolean[nodes + 1];
        answer = new ArrayList<>();

        for (int i = 0; i <= nodes; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        for (int[] edge : graph) {
            adjacencyList[edge[0]].add(edge[1]);
        }

//        dfs_recursive(start);
        dfs_stack(start);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void dfs_recursive(int start) {
        visited[start] = true;
        answer.add(start);

        for (int nextNode : adjacencyList[start]) {
            if (!visited[nextNode]) {
                dfs_recursive(nextNode);
            }
        }
    }

    private static void dfs_stack(int start) {
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();
            visited[currentNode] = true;
            answer.add(currentNode);

            for (int nextNode : adjacencyList[currentNode]) {
                if (!visited[nextNode]) {
                    stack.push(nextNode);
                }
            }
        }
    }
}