import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> xCoordinates = new HashSet<>();
        Set<Integer> yCoordinates = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (xCoordinates.contains(x)) {
                xCoordinates.remove(x);
            } else {
                xCoordinates.add(x);
            }

            if (yCoordinates.contains(y)) {
                yCoordinates.remove(y);
            } else {
                yCoordinates.add(y);
            }
        }

        Iterator<Integer> xIterator = xCoordinates.iterator();
        Iterator<Integer> yIterator = yCoordinates.iterator();
        System.out.println(xIterator.next() + " " + yIterator.next());
    }
}