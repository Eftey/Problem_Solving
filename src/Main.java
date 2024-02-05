import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String s = in.next();
        int c = 0;
        for (char i : s.toCharArray()) if (i >= 'a' && i <= 'z') c++;
        pw.println(c >= (s.length() - c) ? s.toLowerCase() : s.toUpperCase());
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}