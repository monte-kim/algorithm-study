import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int price = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            x -= price * count;
        }
        
        System.out.println(x == 0 ? "Yes" : "No");
    }
}