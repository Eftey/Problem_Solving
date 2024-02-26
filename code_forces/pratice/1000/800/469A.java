import java.io.*;
import java.util.*;

/*
    Problem: I Wanna Be the Guy
    1) We add each level that are passed by X and Y into a Set
    2) Since sets stores only the unique elements, that's why if we check size
    3) If the size is equal to the same as the total levels then true else false
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