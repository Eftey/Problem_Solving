import java.io.*;
import java.util.*;

/*
    Problem: Airlines
    1) If there's more seat than the passenger then they don't need to buy any more planes so answer = 0
    2) But if not the case, then they have to see how many planes they need for the required passengers
    3) Then remove what they currentlu have with that number to get the answer
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), xx = in.nextInt();
            if (x * 100 > xx) pw.println(0);
            else pw.println(((int) (Math.ceil((double) xx / 100))) - x);
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}