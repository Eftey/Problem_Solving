import java.io.*;
import java.util.*;

/*
    Problem: Off By One
    1) Times 10 and add 1 to get the result

 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println((in.nextInt() + in.nextInt()) * 10 + 1);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}