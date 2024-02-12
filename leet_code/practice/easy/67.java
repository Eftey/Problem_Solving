import java.io.*;
import java.math.BigInteger;
import java.util.*;

/*
    Problem: Add Binary
    1)Solution1
    2) We just convert the strings to BigInteger and add their values
    3) Then change the value to string and return it

    1) Solution2
    2) It goes like this 1010 + 11 = 1101
    3) But, we get the result 1011
    4) Only two methods, 1) If carry = 2 or if Carry = 1
    5) When carry = 2 we add 0 to the result
    6) When it's 1 we add 1 to the result
    7) That's it.

    8) We have to update the carry for each bit, so we divide it by 2 until all bits are complete
    9) Lastly, we reverse the string to get the correct result
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(addBinary2("1010", "11"));
        pw.close();
    }

    public static String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a, 2), y = new BigInteger(b, 2), sum = x.add(y);
        return sum.toString(2);
    }

    public static String addBinary2(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, c = 0;
        while (i >= 0 || j >= 0 || c == 1) {
            if (i >= 0) c += a.charAt(i--) - '0';
            if (j >= 0) c += b.charAt(j--) - '0';
            sb.append(c % 2);
            c /= 2;
        }
        return sb.reverse().toString();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}