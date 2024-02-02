import java.io.*;
import java.util.*;

/*
    Problem: Cricket World Cup Qualifier
    1) Check if the input is greater or equal to 12
    2) Print Yes if so else No
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int x = in.nextInt();
        pw.println(x >= 12 ? "Yes" : "No");
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}