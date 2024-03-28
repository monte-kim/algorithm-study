import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<String> tests = new ArrayList<>();
        Map<Integer, String> pokemons1 = new HashMap<>();
        Map<String, Integer> pokemons2 = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            pokemons1.put(i, name);
            pokemons2.put(name, i);
        }

        for (int i = 0; i < M; i++) {
            String test = br.readLine();
            if(pokemons2.containsKey(test)){
                sb.append(pokemons2.get(test));
            }else{
                int index = Integer.parseInt(test);
                sb.append(pokemons1.get(index));
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        br.close();
        bw.close();
    }
}