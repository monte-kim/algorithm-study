package 코딩테스트합격자되기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

// [그래프 - 문제 36] 다익스트라 알고리즘
public class Dijkstra {

    public static void main(String[] args) {
        int[][] graph = {{0, 1, 9}, {0, 2, 3}, {1, 0, 5}, {2, 1, 1}};
        System.out.println(Arrays.toString(solution(graph, 0, 3)));
        int[][] graph2 = {{0, 1, 1}, {1, 2, 5}, {2, 3, 1}};
        System.out.println(Arrays.toString(solution(graph2, 0, 4)));
    }

    private static class Node implements Comparable<Node> {

        int index;
        int cost;

        public Node(int destination, int cost) {
            this.index = destination;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

    private static int[] solution(int[][] graph, int start, int n) {
        ArrayList<Node>[] map = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            map[i] = new ArrayList<>();
        }
        for (int[] edge : graph) {
            map[edge[0]].add(new Node(edge[1], edge[2]));
        }

        boolean[] visited = new boolean[n];
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node currentNode = pq.poll();

            if (visited[currentNode.index]) {
                continue;
            }
            visited[currentNode.index] = true;

            for (Node nextNode : map[currentNode.index]) {
                if (distance[nextNode.index] > nextNode.cost + currentNode.cost) {
                    distance[nextNode.index] = nextNode.cost + currentNode.cost;
                    pq.add(new Node(nextNode.index, distance[nextNode.index]));
                }
            }
        }

        return distance;
    }
}