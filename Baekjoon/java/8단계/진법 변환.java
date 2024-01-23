import java.io.*;
import java.util.*;

// public class Main {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//         String n = st.nextToken();
//         int b = Integer.parseInt(st.nextToken());

//         System.out.print(Integer.parseInt(n, b));
//     }
// }

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        char[] n = st.nextToken().toCharArray();
        int len = n.length;
        int b = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int i = 0; i < len; i++) {
            int num;
            if('0' <= n[i] && n[i] <= '9'){
                num = n[i] - '0';
            }else{
                num = n[i] - 'A' + 10;
            }
            result += (int) Math.pow(b, len - 1 - i) * num;
        }

        System.out.print(result);
    }
}