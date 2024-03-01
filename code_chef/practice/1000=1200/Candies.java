import java.io.*;
import java.util.*;

/*
    Problem: Candies
    1) Just count the frequency of each element in array
    2) If the element occurrence is greater or equal to 3, then we cannot form 2 arrays
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            int[] arr = new int[x * 2];
            for (int i = 0; i < x * 2; i++) arr[i] = in.nextInt();
            Map<Integer, Integer> map = intFreqCount(arr);
            boolean flag = true;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() >= 3) {
                    flag = false;
                    break;
                }
            }
            pw.println(flag ? "YES" : "NO");
        }
        pw.close();
    }

    public static Map<Integer, Integer> intFreqCount(int[] arr) {
        Map<Integer, Integer> f = new HashMap<>();
        for (int element : arr) {
            f.put(element, f.getOrDefault(element, 0) + 1);
        }
        return f;
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}