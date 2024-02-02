import java.io.*;
import java.util.*;

/*
    Problem: Lucky Seven
    1) Print the 6th index of the given string
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String s = in.next();
        pw.println(s.charAt(6));
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}