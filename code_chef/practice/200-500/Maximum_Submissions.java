import java.io.*;
import java.util.*;

/*
    Problem: Maximum Submissions
    1) Given input in minutes so we have to turn it into seconds by multiplying with 60
    2) Then the total seconds = input * 60
    3) Then for each submission we need 30 so diivde the total seconds by 30 will give the answer
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println((in.nextInt() * 60) / 30);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}