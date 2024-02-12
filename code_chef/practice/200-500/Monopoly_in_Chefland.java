import java.io.*;
import java.util.*;

/*
    Problem: Monopoly in Chefland
    1) Both companies have to be greater than the 3rd one to be yes else no
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
            if(x > (y + z)) pw.println("YES");
            else if(y > (x + z)) pw.println("YES");
            else if(z > (x + y)) pw.println("YES");
            else pw.println("NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}