import java.io.*;
import java.util.*;

// public class Main {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         Set<Integer> xSet = new HashSet<>();
//         Set<Integer> ySet = new HashSet<>();

//         for (int i = 0; i < n; i++) {
//             StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//             xSet.add(Integer.parseInt(st.nextToken()));
//             ySet.add(Integer.parseInt(st.nextToken()));
//         }

//         if (xSet.size() <= 1 || ySet.size() <= 1) {
//             System.out.println(0);
//         } else {
//             Integer xMin = Collections.min(xSet);
//             Integer xMax = Collections.max(xSet);
//             Integer yMin = Collections.min(ySet);
//             Integer yMax = Collections.max(ySet);

//             System.out.println((xMax - xMin) * (yMax - yMin));
//         }
//     }
// }

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int xMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x < xMin) {
                xMin = x;
            }
            if (x > xMax) {
                xMax = x;
            }
            if (y < yMin) {
                yMin = y;
            }
            if (y > yMax) {
                yMax = y;
            }
        }

        System.out.println((xMax - xMin) * (yMax - yMin));
    }
}