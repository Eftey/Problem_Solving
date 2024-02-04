import java.io.*;
import java.util.*;

/*
    Problem: Soldier and Bananas
    1) Find the sum from 1 to n
    2) Formula for it is n(n+1)/2
    3) Then multiply by the price of each unit
    4) Then see if the subtraction is lower or not
    5) If so then return 0 else then the subtraction result
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int price = in.nextInt(), has = in.nextInt(), items = in.nextInt(), x = items * (items + 1) / 2;
        pw.println(Math.max(price * x - has, 0));
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}