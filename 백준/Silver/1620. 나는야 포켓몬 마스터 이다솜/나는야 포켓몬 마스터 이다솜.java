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
        Map<String, Integer> pokemons = new HashMap<>();
        String[] pokemonNameIndex = new String[N];


        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            pokemons.put(name, i);
            pokemonNameIndex[i - 1] = name;
        }

        for (int i = 0; i < M; i++) {
            String test = br.readLine();
            if (pokemons.containsKey(test)) {
                sb.append(pokemons.get(test));
            } else {
                int index = Integer.parseInt(test);
                sb.append(pokemonNameIndex[index - 1]);
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        br.close();
        bw.close();
    }
}