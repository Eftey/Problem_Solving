import java.io.*;
import java.util.*;

/*
    Problem: 2000
    1) Total money = 2000 * number of that notes
    2) Then to pay with only 500 we can divide to get the amount
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println((in.nextInt() * 2000) / 500);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}