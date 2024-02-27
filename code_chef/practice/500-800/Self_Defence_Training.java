import java.io.*;
import java.util.*;

/*
    Problem: Self Defence Training
    1) We check if there are any elements in the array that are within 10 and 60 inclusively
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int a = in.nextInt();
            int arr[] = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i] = in.nextInt();
            }
            int c = 0;
            for (int i = 0; i < a; i++) {
                if (arr[i] >= 10 && arr[i] <= 60)
                    c++;
            }
            pw.println(c);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}