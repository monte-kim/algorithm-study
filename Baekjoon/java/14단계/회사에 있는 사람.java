import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Set<String> employees = new TreeSet<>(Collections.reverseOrder()); // HashSet은 순서가 없어서 TreeSet을 사용(정렬)

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String state = st.nextToken();
            if (state.equals("enter")) {
                employees.add(name);
            } else {
                employees.remove(name);
            }
        }

        Iterator<String> it = employees.iterator();
        while (it.hasNext()) {
            sb.append(it.next()).append("\n");
        }

        System.out.println(sb.toString());
    }
}