import java.io.*;
import java.util.*;

/*
    Problem: Second Largest
    1) We take all three numbers into an array sort it and return the 2nd last digit to get the answer
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) arr[i] = in.nextInt();
            Arrays.sort(arr);
            pw.println(arr[1]);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}