import java.io.*;
import java.util.*;

/*
    Problem: Complementary Strand in a DNA
    1) We just have to check every case and print accordingly
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int xx = in.nextInt();
            String x = in.next();
            for (int i = 0; i < x.length(); i++) {
                if(x.charAt(i) == 'A') pw.print('T');
                else if(x.charAt(i) == 'T') pw.print('A');
                else if(x.charAt(i) == 'C') pw.print('G');
                else if(x.charAt(i) == 'G') pw.print('C');
            }
            pw.println();
        }
        pw.close();
    }


    static void
    debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}