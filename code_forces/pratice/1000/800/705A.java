import java.io.*;
import java.util.*;

/*
    Problem: Hulk
    1) If it's even then it's love else it\s hate
    2) And every time he hates at the begining and 'it' in the end so we concatanate the entire string
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        String res = "I hate";
        for(int i = 1; i < n; i++) res += " that I " + ((i & 1) == 1 ? "love" : "hate");
        res += " it";
        pw.println(res);
        pw.close();
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}