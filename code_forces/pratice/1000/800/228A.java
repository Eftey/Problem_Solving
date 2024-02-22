import java.io.*;
import java.util.*;

/*
    Problem: Is your horseshoe on the other hoof?
    1) We have to find the unique colors
    2) So if there are any duplicates we exclude it
    3) Easy way to achomplish it using Set
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        Set<Integer> s = new HashSet<>();
        for (int tt = 0; tt < 4; tt++) s.add(in.nextInt());
        pw.println(4 - s.size());
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}