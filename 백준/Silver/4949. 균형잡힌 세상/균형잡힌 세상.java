import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;
        Stack<Character> parenthesis = new Stack<>();
        StringBuilder sb = new StringBuilder();

        while (!(str = br.readLine()).equals(".")) {
            boolean isBalanced = true;
            char[] arr = str.toCharArray();
            parenthesis.clear();

            for (int i = 0; i < arr.length; i++) {
                // arr[i]가 알파벳이면 continue
                if (arr[i] != '(' && arr[i] != ')' && arr[i] != '[' && arr[i] != ']') {
                    continue;
                }

                if (arr[i] == '(') {
                    parenthesis.push('(');
                } else if (arr[i] == '[') {
                    parenthesis.push('[');
                } else if (arr[i] == ')' && !parenthesis.isEmpty() && parenthesis.peek() != '[') {
                    parenthesis.pop();
                } else if (arr[i] == ']' && !parenthesis.isEmpty() && parenthesis.peek() != '(') {
                    parenthesis.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }
            
            sb.append((parenthesis.isEmpty() && isBalanced) ? "yes" : "no").append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        br.close();
        bw.close();
    }
}