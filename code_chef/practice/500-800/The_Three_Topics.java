import java.io.*;
import java.util.*;

/*
    Problem: The Three Topics
    1) If any of the input is related to the 4th input then yes else no
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int[] arr = new int[4];
        for (int tt = 0; tt < 4; tt++) arr[tt] = in.nextInt();
        if ((arr[0] == arr[3]) || (arr[1] == arr[3]) || (arr[2] == arr[3])) pw.println("YES");
        else pw.println("NO");
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}