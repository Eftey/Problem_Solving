import java.io.*;
import java.util.*;

/*
    Problem: Flip the cards
    1) We just have to subtract the max from the min value to get the answer
    2) But if either one is 0 then no need to flip any card
    3) Also if the max one is too biger than the min one then we just flip the minimum one to save time

 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();
            pw.println(x == 0 || y == 0 ? 0 : ((Math.max(x, y) / 2) >= Math.min(x, y)) ? Math.min(x, y) : Math.max(x, y) - Math.min(x, y));
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}