import java.io.*;
import java.util.*;

/*
    Problem: Magnets
    1) If current value and the next value are not similar then counter++
    2) Same for the other case if they're not matched then again counter++
    3) And lastly after the check we have to increase the counter by 1 or start from 1 instead of 0
    4) Since we skip the first one either way
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        String[] arr = new String[t];
        for (int tt = 0; tt < t; tt++) {
            arr[tt] = in.next();
        }
        int c = 0;
        for (int i = 0; i < t - 1; i++) {
            if (Objects.equals(arr[i], "10") && !Objects.equals(arr[i + 1], "10")) c++;
            if (Objects.equals(arr[i], "01") && !Objects.equals(arr[i + 1], "01")) c++;
        }
        pw.println(c + 1);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}