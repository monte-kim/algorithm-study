import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        customQueue queue = new customQueue();

        for (int i = 0; i < N; i++) {
            String cmd = br.readLine();
            if(cmd.contains("push")){
                StringTokenizer st = new StringTokenizer(cmd, " ");
                st.nextToken();
                queue.push(Integer.parseInt(st.nextToken()));
            } else if(cmd.equals("pop")){
                sb.append(queue.pop()).append("\n");
            } else if(cmd.equals("size")){
                sb.append(queue.size()).append("\n");
            } else if(cmd.equals("empty")){
                sb.append(queue.empty()).append("\n");
            } else if(cmd.equals("front")){
                sb.append(queue.front()).append("\n");
            } else if(cmd.equals("back")){
                sb.append(queue.back()).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static class customQueue {
        List<Integer> queueList;

        public customQueue() {
            queueList = new LinkedList<>();
        }

        public void push(int x) {
            queueList.add(x);
        }

        public int pop() {
            if (queueList.isEmpty()) {
                return -1;
            }

            int result = queueList.get(0);
            queueList.remove(0);
            return result;
        }

        public int size() {
            return queueList.size();
        }

        public int empty() {
            return queueList.isEmpty() ? 1 : 0;
        }

        public int front() {
            if (queueList.isEmpty()) {
                return -1;
            }

            return queueList.get(0);
        }

        public int back() {
            if (queueList.isEmpty()) {
                return -1;
            }
            return queueList.get(queueList.size() - 1);
        }
    }
}