import java.io.*;
import java.util.*;

/*
    Problem: Watching Movies at 2x
    1) We have to divide the y minutes by 2 and subtract the value from the actual minutes

 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(in.nextInt() - (in.nextInt() / 2));
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}