import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        long result = 0;

        for (int i = 0; i < T; i++) {
            char[] vpsArray = br.readLine().toCharArray();
            sb.append(checkVPS(vpsArray) ? "YES" : "NO").append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        br.close();
        bw.close();
    }

    public static boolean checkVPS(char[] vpsArray) {
        Stack<Character> stack = new Stack<>();
        try {
            for (int i = 0; i < vpsArray.length; i++) {
                if (vpsArray[i] == '(') {
                    stack.push('(');
                } else {
                    stack.pop();
                }
            }
            return stack.isEmpty();
        } catch (EmptyStackException e) {
            return false;
        }
    }
}