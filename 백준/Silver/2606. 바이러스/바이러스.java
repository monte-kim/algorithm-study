import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int computer = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] computers = new ArrayList[computer + 1];
        int[] contaminated = new int[computer + 1];
        for (int i = 0; i <= computer; i++) {
            computers[i] = new ArrayList<>();
            contaminated[i] = 0;
        }

        int connections = Integer.parseInt(br.readLine());
        for (int i = 0; i < connections; i++) {
            String[] input = br.readLine().split(" ");
            int comA = Integer.parseInt(input[0]);
            int comB = Integer.parseInt(input[1]);
            computers[comA].add(comB);
            computers[comB].add(comA);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        while (!queue.isEmpty()) {
            int currentCom = queue.poll();
            if (contaminated[currentCom] == 0) {
                contaminated[currentCom] = 1;
                for (int i = 0; i < computers[currentCom].size(); i++) {
                    queue.add(computers[currentCom].get(i));
                }
            }
        }

        int result = -1;
        for (int com : contaminated) {
            if (com == 1) {
                result++;
            }
        }

        System.out.println(result);
    }
}