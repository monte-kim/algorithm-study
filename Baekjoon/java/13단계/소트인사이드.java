import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N.length(); i++) {
            list.add(N.charAt(i) - '0');
        }

        list.sort(Collections.reverseOrder());

        list.forEach(sb::append);

        System.out.println(sb.toString());
    }
}