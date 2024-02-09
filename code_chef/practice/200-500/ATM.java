import java.io.*;
import java.util.*;

/*
    Problem: ATM
    1) First thing she can only withdraw if she has more money and the amount she wants to withdraw
    1.1) Is a multiple of 5
    2) So we find if it's divisible by 5 or not and if it's smaller after adding the 0.5 fee as well
    3) If so then we subtract the value from the fund and also subtract 0.5 as a transition fee
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int x = in.nextInt();
        double xx = in.nextDouble();
        pw.printf("%.2f", ((x % 5 == 0 && x + 0.5 <= xx) ? (xx - x - 0.5) : xx));
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}