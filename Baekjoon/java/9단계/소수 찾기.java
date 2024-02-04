import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int result = 0;
        boolean[] prime = new boolean[1001];
        prime[0] = prime[1] = true; //false가 소수

        for(int i = 2; i * i <= 1000; i++){
            if(!prime[i]){ //i가 소수이면
                for(int j = i * i; j <= 1000; j += i){
                    prime[j] = true; //i의 배수는 소수 아님
                }
            }
        }

        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(st.nextToken());
            if(!prime[x]){
                result++;
            }
        }

        System.out.println(result);
    }
}