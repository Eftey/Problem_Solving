import java.io.*;
import java.util.*;

/*
    Problem: Arrival of the General
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), max = 0, min = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[max]) max = i;
            if (arr[i] <= arr[min]) min = i;
        }
        if (max < min) pw.println(max + (n - min - 1));
        else pw.println(max + (n - min - 2));
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}