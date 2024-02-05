import java.io.*;
import java.util.*;

/*
    Problem: Word
    1) Check for the number of lowercase characters in the string
    2) Then subtract them from the length to get the uppercase number
    3) If the comparison between lower and uper is smaller then All Upper else all lower
 */

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String s = in.next();
        int c = 0;
        for (char i : s.toCharArray()) if (i >= 'a' && i <= 'z') c++;
        pw.println(c >= (s.length() - c) ? s.toLowerCase() : s.toUpperCase());
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}