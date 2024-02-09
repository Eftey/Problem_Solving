import java.io.*;
import java.util.*;

/*
    Problem: Translation
    1) We have to see if the first input was revered or not
    2) We can use the built-in function OR
    3) We can traverse through the entire string and at the same time
    4) Check for the both string one from forward and the other is from backward
    5) String size - current index means to traverse from the back
    6) And to keep it without index out of bound error we subtract 1 from the end of the size
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String s = in.next(), ss = in.next();
        StringBuilder x = new StringBuilder(s).reverse();
        pw.println(ss.contains(x) ? "YES" : "NO");

        //If you want faster than call the function
        //fastest(s, ss);

        pw.close();
    }

    //Faster with string builder
    public static void fastest(String s, String ss) {
        PrintWriter pw = new PrintWriter(System.out);
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.length() != ss.length()) {
                flag = false;
                break;
            }
            if (s.charAt(i) == ss.charAt(s.length() - i - 1)) ;
            else flag = false;
        }
        pw.println(flag ? "YES" : "NO");
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}