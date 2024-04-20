import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Stack<Integer> stack = new Stack<>();
        int sequence = 1;

        for (int i = 0; i < people; i++) {
            int next = Integer.parseInt(st.nextToken());
            if (next == sequence) {
                sequence++;
            } else {
                while(!stack.isEmpty() && stack.peek() == sequence){
                    stack.pop();
                    sequence++;
                }
                stack.push(next);
            }
        }

        while (!stack.isEmpty()) {
            int next = stack.pop();
            if (next == sequence) {
                sequence++;
            } else {
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");
    }
}