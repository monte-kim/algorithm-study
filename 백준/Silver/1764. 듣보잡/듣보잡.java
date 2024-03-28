import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> neverHeard = new HashSet<>();
        List<String> neverKnown = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            neverHeard.add(br.readLine());
        }
        for(int i = 0; i < M; i++){
            String name = br.readLine();
            if(neverHeard.contains(name)){
                count++;
                neverKnown.add(name);
            }
        }

        Collections.sort(neverKnown);

        sb.append(count).append("\n");
        for (String name:neverKnown) {
            sb.append(name).append("\n");
        }

        System.out.print(sb.toString());
    }
}