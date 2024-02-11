import java.io.*;
import java.util.*;

/*
    Problem: Speciality
    1) If input * 10 greater or equal than input two then Cloth else Disposable
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(in.nextInt() * 10 >= in.nextInt() ? "Cloth" : "Disposable");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}