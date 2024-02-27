import java.io.*;
import java.util.*;

/*
    Problem: Primality Test
    1) This is the most efficeient algorithm to check if a number is prime or not
    2) Here we fill an array with prime numbers and then see if the given number is a prime or not
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println(isPrime(in.nextInt()) ? "yes" : "no");
        }
        pw.close();
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) prime[i] = true;
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) for (int i = p * p; i <= n; i += p) prime[i] = false;
        }
        return prime[n];
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}