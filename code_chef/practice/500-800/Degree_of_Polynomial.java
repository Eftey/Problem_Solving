import java.io.*;
import java.util.*;

/*
    Problem: Degree of Polynomial
    1) We store the values into a stack and remove all the last 0's from it
    2) And return the size - 1 this is because x^0 doesn't count so we remove it
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            Stack<Integer> s = new Stack<>();
            for (int i = 0; i < x; i++) s.add(in.nextInt());
            int len = s.size();
            for (int i = 0; i < len; i++) {
                int peek = s.peek();
                if (peek == 0) s.pop();
            }
            pw.println(s.size() - 1);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}