import java.io.*;
import java.util.*;

/*
    Problem: Easy Pronunciation
    1) Here we check when we find any vowel
    1.1) If there's one, then we check if the counter is greater than 4 or not, if so then break if not then 0
    2) IF there is only consonant then we increase the counter
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), c = 0;
            String s = in.next();
            for (int i = 0; i < x; i++) {
                if ((s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')) {
                    if (c >= 4) break;
                    else c = 0;
                } else c++;
            }
            pw.println(c >= 4 ? "NO" : "YES");
        }

        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}