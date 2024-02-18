import java.io.*;
import java.util.*;

/*
    Problem: Bath in Winters
    1) We have to multiply the water and then divide the total capacity by that number to get the result

 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(in.nextInt() / (in.nextInt() * 2));
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}