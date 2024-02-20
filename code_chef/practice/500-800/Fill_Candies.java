import java.io.*;
import java.util.*;

/*
    Problem: Fill Candies
    1) Wer can multiply the total pockets with each candy they can hold
    2) Then divide the total candies needed with that result to get the answer
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println((int) Math.ceil((double) in.nextInt() / (in.nextInt() * in.nextInt())));
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}