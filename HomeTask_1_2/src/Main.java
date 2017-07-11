import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reverse(reader.readLine());
    }

    private static void reverse(String word) {
        int start = 0;
        int end = 0;
        boolean isEnd = false;
        for (int i = 0; i < word.length(); i++) {
            if (i == word.length() - 1) isEnd = true;
            if (word.charAt(i) == ' ' || isEnd) {
                if (isEnd)
                    end = i;
                else
                    end = i - 1;
                while (end >= start) {
                    System.out.print(word.charAt(end));
                    --end;
                }
                start = i + 1;
                System.out.print(" ");
            }

        }
    }
}
