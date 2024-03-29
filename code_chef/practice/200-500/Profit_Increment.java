import java.io.*;
import java.util.*;

/*
    Problem: Profit Increment
    1) Here we have the new selling price from x * 10/100 which is x * 0.1
    2) Then we have to get the new profit which is x - y
    3) Then the final result should be new selling price - new profit
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt();
            int profit = x - y;
            int newSell =  x + (int) (x * 0.1);
            pw.println(newSell - profit);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}