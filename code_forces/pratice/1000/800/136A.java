import java.io.*;
import java.util.*;

/*
    Problem: Presents
    1) Here we have to store the gifts for corresponding friend
    2) The given array is the location
    3) So we have to store his friends in those locations
    4) This is just perpetuation

 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        int[] arr = new int[t + 1];
        for (int tt = 1; tt <= t; tt++) {
            arr[in.nextInt()] = tt;
        }
        for (int i = 1; i <= t; i++) {
            pw.print(arr[i] + " ");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}