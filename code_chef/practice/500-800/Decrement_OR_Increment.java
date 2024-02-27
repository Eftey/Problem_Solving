import java.io.*;
import java.util.*;

/*
    Problem: Decrement OR Increment
    1) If it's divisible bt 4 then increase by 1 else decrease
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int x = in.nextInt();
        pw.println(x % 4 == 0 ? ++x : --x);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}