import java.io.*;
import java.util.*;

/*
    Problem: Building Race
    1) Whoever is smaller at time they win if equal then it's both
    2) Speed = distance / time
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int cc = in.nextInt(), a = in.nextInt(), cf = in.nextInt(), b = in.nextInt();
            double x = (double) cc / cf, xx = (double) a / b;
            pw.println(x > xx ? "Chefina" : x < xx ? "Chef" : "Both");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}