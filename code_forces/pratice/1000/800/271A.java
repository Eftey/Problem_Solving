import java.io.*;
import java.util.*;

/*
    Problem: Beautiful Year
    1) Here we have to find each digit using mod and division strategy
    2) Then Check if each digit is unique from each other or not
    3) If it's not then we increase the year by 1 until we find the beautiful year

 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int x = in.nextInt();
        ++x;
        while (!solve(x)) ++x;
        pw.println(x);
        pw.close();
    }

    public static boolean solve(int d) {
        int x = d % 10;
        d /= 10;
        int xx = d % 10;
        d /= 10;
        int xxx = d % 10;
        d /= 10;
        int xxxx = d;
        return (x != xx) && (x != xxx) && (x != xxxx) && (xx != xxx) && (xx != xxxx) && (xxx != xxxx);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}