import java.io.*;
import java.util.*;

/*
    Problem: Possible Victory
    1) O - 6 = Total over left
    2) Total over times 6 = total tries they have
    3) Total tries * 6 = Each try can score
    6) If that score and the already achieved score is greater than yes else no
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(in.nextInt() < ((((20 - in.nextInt()) * 6)) * 6 + in.nextInt()) ? "YES" : "NO");
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}