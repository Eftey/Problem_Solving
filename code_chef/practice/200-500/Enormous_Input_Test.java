import java.io.*;
import java.util.*;

/*
    Problem: Enormous Input Test
    1) We just check if the numbers are divisible by k using mod operation and if so we add it to sum
    2) And lastly print the value of sum
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt(), k = in.nextInt(), sum = 0;
        for (int tt = 0; tt < t; tt++) {
            if (in.nextInt() % k == 0) sum++;
        }
        pw.println(sum);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}