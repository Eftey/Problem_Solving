import java.io.*;
import java.util.*;

/*
    Problem: Best of Two
    1) We take the inputs into an array then sort them
    2) Then at the last two index is the greater values are
    3) Whoever has the sum of those values is bigger is the winner if they're eqyal then it's a tie
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int[] a1 = new int[3], a2 = new int[3];
            for (int i = 0; i < 3; i++) a1[i] = in.nextInt();
            for (int i = 0; i < 3; i++) a2[i] = in.nextInt();
            Arrays.sort(a1);
            Arrays.sort(a2);
            pw.println(a1[2] + a1[1] > a2[1] + a2[2] ? "Alice" : a1[2] + a1[1] < a2[1] + a2[2] ? "Bob" : "Tie");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}