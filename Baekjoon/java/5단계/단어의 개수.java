import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int previousLetter = ' ';
        int currentLetter = System.in.read();
        while (currentLetter != '\n') {
            if(currentLetter != ' ' && previousLetter == ' '){
                count++;
            }
            previousLetter = currentLetter;
            currentLetter = System.in.read();
        }
        System.out.print(count);
    }
}