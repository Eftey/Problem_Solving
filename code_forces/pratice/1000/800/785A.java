import java.io.*;
import java.util.*;

/*
    Problem: Anton and Polyhedrons
    1) Just add the equvalent values for each condition to the sum and print it
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt(), c = 0;
        for (int tt = 0; tt < t; tt++) {
            String s = in.next();
            if (s.equals("Tetrahedron")) c += 4;
            else if (s.equals("Cube")) c += 6;
            else if (s.equals("Octahedron")) c += 8;
            else if (s.equals("Dodecahedron")) c += 12;
            else c += 20;
        }
        pw.println(c);
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}