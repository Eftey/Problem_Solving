import java.io.*;
import java.util.*;

/*
    Problem: Mutated Minions
    1) While taking the input, we added by k and see if it's divisible by 7 or not
    2) If so we add +1 to it and print the result
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt(), c = 0;
            for (int i = 0; i < n; i++) if ((in.nextInt() + k) % 7 == 0) c++;
            pw.println(c);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}