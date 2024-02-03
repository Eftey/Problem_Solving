import java.io.*;
import java.util.*;

/*
    Problem: Puzzle Hunt
    1) If he has people from 6 to 8 then yes else no

 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int x = in.nextInt();
        pw.println(x <= 8 && x >= 6 ? "Yes" : "No");

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}