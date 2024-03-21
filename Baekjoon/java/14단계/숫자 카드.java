import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Set<Integer> cards = new HashSet<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            cards.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int card = Integer.parseInt(st.nextToken());
            if (!cards.contains(card)) {
                sb.append(0).append(" ");
                continue;
            }
            sb.append(1).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        // 중복 없고, List보다 contains 실행 속도가 더 빠른 Set을 활용했는데, 왜 내가 시간이 더 느린가?
    }
}