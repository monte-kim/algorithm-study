import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(br.readLine());
        int count = 0;
        int sum = 0;

        while (sum < x) {
            count++;
            sum += count;
        }
        sum -= count; //시작 지점

        int total = count + 1;
        if (count % 2 == 0) {
            sb.append(x - sum).append("/").append(total - (x - sum));
        }
        if (count % 2 != 0) {
            sb.append(total - (x - sum)).append("/").append(x - sum);
        }

        bw.write(sb.toString());
        bw.flush();
    }
}