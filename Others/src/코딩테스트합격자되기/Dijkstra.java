package 코딩테스트합격자되기;

import java.util.Arrays;

// [그래프 - 문제 36] 다익스트라 알고리즘
public class Dijkstra {

    public static void main(String[] args) {
        int[][] graph = {{0, 1, 9}, {0, 2, 3}, {1, 0, 5}, {2, 1, 1}};
        System.out.println(Arrays.toString(solution(graph, 0, 3)));
        int[][] graph2 = {{0, 1, 1}, {1, 2, 5}, {2, 3, 1}};
        System.out.println(Arrays.toString(solution(graph2, 0, 4)));
    }

    private static int[] solution(int[][] graph, int start, int n) {
        return new int[0];
    }
}