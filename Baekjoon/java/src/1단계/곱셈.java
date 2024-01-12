import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int digitOne = a * (b % 10);
        int digitTen = a * (b % 100 - b % 10);
        int digitHundred = a * (b % 1000 - b % 100);
        System.out.println(digitOne);
        System.out.println(digitTen / 10);
        System.out.println(digitHundred / 100);
        System.out.println(digitOne + digitTen + digitHundred);
    }
}