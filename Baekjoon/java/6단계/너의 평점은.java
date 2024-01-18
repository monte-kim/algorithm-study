import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double totalCredit = 0.0;
        double sum = 0.0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            double gradeScore;

            if (grade.equals("P")) {
                continue;
            }

            switch (grade) {
                case "A+":
                    gradeScore = 4.5;
                    break;
                case "A0":
                    gradeScore = 4.0;
                    break;
                case "B+":
                    gradeScore = 3.5;
                    break;
                case "B0":
                    gradeScore = 3.0;
                    break;
                case "C+":
                    gradeScore = 2.5;
                    break;
                case "C0":
                    gradeScore = 2.0;
                    break;
                case "D+":
                    gradeScore = 1.5;
                    break;
                case "D0":
                    gradeScore = 1.0;
                    break;
                default:
                    gradeScore = 0.0;
                    break;
            }
            sum += credit * gradeScore;
            totalCredit += credit;
        }

        System.out.println(sum / totalCredit);
    }
}