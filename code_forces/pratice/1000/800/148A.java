import java.io.*;
import java.util.*;

/*
    Problem: Insomnia cure
    1) We just find which ith is divisible by each ith dragon
    2) If they're divisible then they are hurt, and we count the damage in c
    3) Lastly, we print the answer
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int k = in.nextInt(), l = in.nextInt(), m = in.nextInt(), n = in.nextInt(), d = in.nextInt(), c = 0;
        for (int i = 1; i <= d; i++) if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) c++;
        pw.println(c);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}