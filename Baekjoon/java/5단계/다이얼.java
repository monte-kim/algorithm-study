import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String[] input = br.readLine().split("");
        int result = 0;

        for (String letter : input) {
            for(int i = 0; i < numbers.length; i++){
                String number = numbers[i];
                if(number.contains(letter)){
                    result += i + 3;
                }
            }
        }

        System.out.print(result);
    }
}