import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

// [그래프 - 문제 35] 너비 우선 탐색 순회
public class Graph36 {

    public static void main(String[] args) {
        int[][] graph = {{0, 1, 9}, {0, 2, 3}, {1, 0, 5}, {2, 1, 1}};
        System.out.println(Arrays.toString(solution(graph, 0, 3)));
        int[][] graph2 = {{0, 1, 1}, {1, 2, 5}, {2, 3, 1}};
        System.out.println(Arrays.toString(solution(graph2, 0, 4)));
    }

    private static class Node{
        int destination, cost;

        public Node(int destination, int cost) {
            this.destination = destination;
            this.cost = cost;
        }
    }

    private static int[] solution(int[][] graph, int start, int n) {
        ArrayList<Node>[] adjacencyList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjacencyList[i] = new ArrayList<>();
        }

        for (int[] edge : graph) {
            int startNode = edge[0];
            int destination = edge[1];
            int cost = edge[2];
            adjacencyList[startNode].add(new Node(destination, cost));
        }

        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        boolean[] visited = new boolean[n];

        distance[start] = 0;

        PriorityQueue<Node> pq= new PriorityQueue<>(((o1, o2) -> Integer.compare(o1.cost, o2.cost)));
        pq.add(new Node(start, 0));

        while(!pq.isEmpty()){
            Node currentNode = pq.poll();

            if(visited[currentNode.destination]){
                continue;
            }

            visited[currentNode.destination] = true;

            for (Node nextNode : adjacencyList[currentNode.destination]) {
                if(distance[nextNode.destination] > currentNode.cost + nextNode.cost){
                    distance[nextNode.destination] = currentNode.cost + nextNode.cost;
                    pq.add(new Node(nextNode.destination, distance[nextNode.destination]));
                }
            }
        }

        return distance;
    }
}