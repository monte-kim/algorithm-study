import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String reversedWord = new StringBuilder(word).reverse().toString();
        System.out.print(word.equals(reversedWord) ? 1 : 0);
    }
}

// public class Main {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         String word = br.readLine();
//         char[] letterArr = word.toCharArray();
//         int len = letterArr.length;
//         int result = 1;

//         for(int i = 0; i < len / 2; i++){
//             char start = letterArr[i];
//             char end = letterArr[len - i - 1];
//             if(start != end){
//                 result = 0;
//                 break;
//             }
//         }

//         System.out.print(result);
//     }
// }