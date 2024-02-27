import java.io.*;
import java.math.BigInteger;
import java.util.*;

/*
    Problem: Small factorial
    1) We just use the recursion to get the n * (n - 1) multiplication
    2) But since the input is large so we had to use BigInteger as equivalent for long long in c++

 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(fact(in.nextBigInteger()));
        }
        pw.close();
    }

    public static BigInteger fact(BigInteger n) {
        return (Objects.equals(n, BigInteger.ONE) || Objects.equals(n, BigInteger.ZERO)) ? BigInteger.ONE : n.multiply(fact(n.subtract(BigInteger.ONE)));
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}