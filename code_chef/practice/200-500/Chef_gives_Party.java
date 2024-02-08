import java.io.*;
import java.util.*;

/*
    Problem: Chef gives Party
    1) All his friends * number of burgers = Total cost then Subtract it from his total rupees
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println((in.nextInt() * in.nextInt()) <= in.nextInt() ? "YES" : "NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}