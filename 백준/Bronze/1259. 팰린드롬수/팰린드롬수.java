import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		while(true){
			st = new StringTokenizer(br.readLine(), " ");
			String number = st.nextToken();

			if("0".equals(number)) break;

			char[] digits = number.toCharArray();
			int len = digits.length;
			boolean isPalindrome = true;

			for(int i = 0; i < len; i++){
				if(digits[i] != digits[len - i - 1]){
					isPalindrome = false;
					break;
				}
			}

			if(isPalindrome){
				sb.append("yes\n");
			} else {
				sb.append("no\n");
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}