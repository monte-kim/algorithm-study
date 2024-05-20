import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> cards = new LinkedList<>();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            cards.add(i);
        }

        while (cards.size() > 1) {
            count++;
            if (count % 2 != 0) {
                cards.poll();   // 하나 버리고
            } else {
                cards.add(cards.poll());
            }
        }

        System.out.println(cards.poll());
    }
}