//import java.io.*;
//import java.util.*;
//
///*
//    Problem: D
// */
//
//public class Main {
//
//    public static void main(String[] args) throws Exception {
//        Scanner in = new Scanner(System.in);
//        PrintWriter pw = new PrintWriter(System.out);
//        int t = in.nextInt();
//        for (int tt = 0; tt < t; tt++) {
//            int x = in.nextInt();
//            boolean[] prime = sive(x);
//            if (x % 2 != 0) {
//                --x;
//
//            }
//            for (int i = 0; i < x / 2; i++) {
//                pw.println(prime[i]);
//                pw.println(prime[i]);
//            }
//
//        }
//        pw.close();
//    }
//
//    public static boolean[] sive(int n) {
//        boolean[] prime = new boolean[n + 1];
//        for (int i = 0; i <= n; i++)
//            prime[i] = true;
//
//        for (int p = 2; p * p <= n; p++) {
//            if (prime[p]) {
//                for (int i = p * p; i <= n; i += p)
//                    prime[i] = false;
//            }
//        }
//        return prime;
//    }
//
//    static void debug(Object... obj) {
//        System.err.println(Arrays.deepToString(obj));
//    }
//}