import java.io.*;
import java.util.*;

/*
    Problem: Balanced Binary Tree
    1)
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt(), x = in.nextInt();
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < x; i++) s.add(in.nextInt());
        int xx = in.nextInt();
        for (int i = 0; i < xx; i++) s.add(in.nextInt());
        pw.println(s.size() == t ? "I become the guy." : "Oh, my keyboard!");
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}