import java.io.*;
import java.util.*;

/*
    Problem: Bone Appetit
    1) Bones * total treats + Blood * total treats = All he's getting

 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        pw.println((a * c) + (b * d));

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}