import java.io.*;
import java.util.*;

/*
    Problem: A. Bear and Big Brother
    1) a gains by 3 while b gains by 2
    2) Check if a > b if so then break
    3) Count every iteration while otherwise
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int a = in.nextInt(), b = in.nextInt(), c = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            c++;
        }
        pw.println(c);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}