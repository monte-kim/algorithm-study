import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // Fizz는 a, b, c 중 무조건 하나 존재한다
        // Buzz는 하나도 안 나올 수도 있다
        // FizzBuzz는 15의 배수
        // 자연수는 최소 1개 나온다

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        int nextNumber;

        if (isNumeric(a)) {
            nextNumber = Integer.parseInt(a) + 3;
        } else if (isNumeric(b)) {
            nextNumber = Integer.parseInt(b) + 2;
        } else {
            nextNumber = Integer.parseInt(c) + 1;
        }

        if (nextNumber % 3 == 0) {
            sb.append("Fizz");
        }
        if (nextNumber % 5 == 0) {
            sb.append("Buzz");
        }
        if (nextNumber % 3 != 0 && nextNumber % 5 != 0) {
            sb.append(nextNumber);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isNumeric(String str) {
        return str.matches("[+-]?\\d*(\\.\\d+)?");
    }
}