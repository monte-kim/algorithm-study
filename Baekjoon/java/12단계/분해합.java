import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int N = Integer.parseInt(n);

        int sum;
        int result = 0;

        //N에서 9 * n.length()를 하는 이유는 1부터 반복문을 수행할 필요 없이, 분해합에서 본인을 제외한 각 자릿수의 겂의 합을 0에서 시작하기 위함이다.
        for (int i = N - 9 * n.length(); i <= N; i++) {
            char[] digits = Integer.toString(i).toCharArray();
            sum = i;

            for (char digit : digits) {
//                sum += Integer.parseInt(String.valueOf(digit));
                sum += Character.getNumericValue(digit);
                //여기서 왜 첫번째 코드는 런타임 에러(NumberFormat)이 발생하는지 아직 알아내지 못했다.
            }

            if (sum == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}

