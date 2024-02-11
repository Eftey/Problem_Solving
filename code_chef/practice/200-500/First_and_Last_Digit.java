import java.io.*;
import java.util.*;

/*
    Problem: First and Last Digit
    1) We just find the reminder of a digit to get the last digit and add it to the List
    2) Then we remove that digit by dividing the number by 10
    3) Continue to process until the number becomes less than 0
    4) And we print the sum of First and the last values of the List
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            List<Integer> li = new ArrayList<>();

            while (x > 0) {
                li.add(x % 10);
                x /= 10;
            }
            pw.println(li.get(0) + li.get(li.size() - 1));
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}