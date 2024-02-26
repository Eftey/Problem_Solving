import java.io.*;
import java.util.*;

/*
    Problem: Too many Floors
    1) We just have to find which floor Chef is and subtract it from the floor where Chefina was
    2) In order to find their floor location we just divide their input by 10 and ceil the value to get the uper limit
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(Math.abs(((int) Math.ceil((double) in.nextInt() / 10)) - ((int) Math.ceil((double) in.nextInt() / 10))));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}