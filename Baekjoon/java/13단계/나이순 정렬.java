import java.io.*;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;

// 380ms
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        StringBuilder[] people = new StringBuilder[201];

        for (int i = 1; i < 201; i++) {
            people[i] = new StringBuilder();
        }

        for (int i = 0; i < N; i++) {
            String user = br.readLine();
            st = new StringTokenizer(user, " ");
            int age = Integer.parseInt(st.nextToken());
            people[age].append(user).append("\n");
        }

        for (int i = 1; i < 201; i++) {
            if (people[i] != null) {
                bw.write(people[i].toString());
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

// 2828ms
// public class Main {
// public static void main(String[] args) throws IOException {
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
// StringBuilder sb = new StringBuilder();
// StringTokenizer st;
// int N = Integer.parseInt(br.readLine());
// User[] users = new User[N];

// for (int i = 0; i < N; i++) {
// st = new StringTokenizer(br.readLine(), " ");
// int age = Integer.parseInt(st.nextToken());
// String name = st.nextToken();
// users[i] = new User(age, name, i + 1);
// }

// Arrays.sort(users);

// for (int i = 0; i < N; i++) {
// sb.append(users[i]).append("\n");
// }

// bw.write(sb.toString());
// bw.flush();
// br.close();
// bw.close();
// }

// static class User implements Comparable<User> {
// private final int age;
// private final String name;
// private final int index;
// // 왜 final이어야 하지? ->

// public User(int age, String name, int index) {
// this.age = age;
// this.name = name;
// this.index = index;
// }

// public int getAge() {
// return age;
// }

// public String getName() {
// return name;
// }

// public int getIndex() {
// return index;
// }

// @Override
// public String toString() {
// return String.format("%d %s", age, name);
// }

// @Override
// public int compareTo(User other) {
// return age == other.getAge() ? index - other.getIndex() : age -
// other.getAge();
// }
// }
// }