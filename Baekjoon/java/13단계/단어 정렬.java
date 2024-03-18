import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Word> words = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            words.add(new Word(br.readLine()));
        }

        Collections.sort(words);

        for (int i = 0; i < N; i++) {
            if (i < N - 1 && words.get(i).word.equals(words.get(i + 1).word)) {
                continue;
            }
            sb.append(words.get(i)).append("\n");
        }

        System.out.println(sb);
    }

    static class Word implements Comparable<Word> {
        String word;

        public Word(String word) {
            this.word = word;
        }

        public String toString() {
            return word;
        }

        public int getLength() {
            return word.length();
        }

        @Override
        public int compareTo(Word other) {
            return getLength() == other.getLength() ? word.compareTo(other.word) : getLength() - other.getLength();
        }
    }
}