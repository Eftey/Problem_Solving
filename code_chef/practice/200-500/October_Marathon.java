import java.io.*;
import java.util.*;


/*
    Problem: October Marathon
    1) If Less or equal to 3 hrs then Gold
    2) If greater than 3 but less than 6 then Silver
    3) Else it's a bronze
 */

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int x = in.nextInt();
        if (x < 3) pw.println("GOLD");
        else if (x < 6) pw.println("SILVER");
        else pw.println("BRONZE");
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}