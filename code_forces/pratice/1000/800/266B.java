import java.io.*;
import java.util.*;

/*
    Problem: B Queue at the School
    1) Solution1
    2) Here we need to change B--> G and G --- B
    3) It means that if we find BG it'll change to GB every time
    4) We can achieve it using built-in replace function

    1) Solution2
    2) Here find the index where it has B and immediately it has G
    3) Then we swap the values using String builder
    4) And update the string if we need to do it more than once
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), k = in.nextInt();
        String s = in.next();
        for (int tt = 0; tt < k; tt++) {
            s = s.replace("BG", "GB");
        }
        pw.println(s);
        pw.close();
    }

    public static void solution2() {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), k = in.nextInt();
        String s = in.next();
        StringBuilder sb = new StringBuilder(s);
        for (int tt = 0; tt < k; tt++) {
            for (int i = 0; i < n - 1; ++i) {
                if (s.charAt(i) == 'B' && s.charAt(i + 1) == 'G') {
                    sb.setCharAt(i, 'G');
                    sb.setCharAt(i + 1, 'B');
                }
            }
            s = sb.toString();
        }
        pw.println(sb);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}