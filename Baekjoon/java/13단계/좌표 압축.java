import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] points = new int[N];
        Map<Integer, Integer> pointMap = new HashMap<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            points[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortedPoints = points.clone();
        Arrays.sort(sortedPoints); // 정렬

        int index = 0;
        for (int i = 0; i < N; i++) {
            if (pointMap.containsKey(sortedPoints[i])) {
                continue;
            }

            pointMap.put(sortedPoints[i], index);
            index++;
        }

        for (int point : points) {
            bw.write(pointMap.get(point) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

// 시간 초과
// public class Main {
// public static void main(String[] args) throws IOException {
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// StringTokenizer st;
// StringBuilder sb = new StringBuilder();
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

// int N = Integer.parseInt(br.readLine());
// int[] points = new int[N];
// Set<Integer> pointSet = new HashSet<>();

// st = new StringTokenizer(br.readLine(), " ");
// for (int i = 0; i < N; i++) {
// points[i] = Integer.parseInt(st.nextToken());
// pointSet.add(points[i]);
// }

// // Integer[] pointSetArray = pointsSet.toArray(); // 왜 에러? toArray()는
// Object[]를 반환하는데 Integer[]로 변환되지 않는다.
// List<Integer> pointSetList = new ArrayList<>(pointSet);
// Collections.sort(pointSetList);

// for (int i = 0; i < N; i++) {
// bw.write(pointSetList.indexOf(points[i]) + " ");
// }

// bw.flush();
// bw.close();
// br.close();
// }
// }