import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Integer[] baskets = new Integer[n];

        for (int i = 0; i < n; i++) {
            baskets[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());
            Integer[] copy = Arrays.copyOfRange(baskets, first - 1, last);
            List<Integer> list = Arrays.asList(copy);
            Collections.reverse(list);
            copy = list.toArray(new Integer[list.size()]);
            System.arraycopy(copy, 0, baskets, first - 1, last - first + 1);
        }

        for (int i = 0; i < n; i++) {
            sb.append(baskets[i]).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}