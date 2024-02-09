import java.io.*;
import java.util.*;

/*
    Problem: Volume Control
    1) First input to second input subtraction will give the number of button he has to press
    2) But it might become negative if the second input is greater that's why we use Absolute value to avoid that
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(Math.abs(in.nextInt() - in.nextInt()));
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}