import java.io.*;
import java.util.*;

/*
    Problem: Chef Eren
    1) We have to multiply every episode by e or o
    2) So we have to traverse through each episode and multiply and add sum
    3) Then print the sum
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), e = in.nextInt(), o = in.nextInt(), sum = 0;
            for (int i = 1; i <= x; i++) {
                if (i % 2 == 0) sum += e;
                else sum += o;
            }
            pw.println(sum);
        }
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}