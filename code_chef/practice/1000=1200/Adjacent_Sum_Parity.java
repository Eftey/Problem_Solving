import java.io.*;
import java.util.*;

/*
    Problem: Adjacent Sum Parity
    1) We check for every element if there's 1 if so we count how many
    2) Then if that number is divisible by 2 then yes else no
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), c = 0;
            for (int i = 0; i < x; i++) {
                int xx = in.nextInt();
                if (xx == 1) c++;
            }
            pw.println(c % 2 == 0 ? "YES" : "NO");
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}