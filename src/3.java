//import java.io.*;
//import java.util.*;
//
///*
//    Problem: C
// */
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        PrintWriter pw = new PrintWriter(System.out);
//        int t = in.nextInt();
//        for (int tt = 0; tt < t; tt++) {
//            int n = in.nextInt(), m = in.nextInt();
//            long[] arr = new long[n];
//            for (int i = 0; i < n; i++) arr[i] = in.nextLong();
//            String s = in.next();
//            long c = 1;
//            for (int i = 0; i < n; i++) c *= arr[i];
//
//            long[] res = new long[n];
//            int f = 0, l = n - 1;
//            for (int i = 0; i < n; i++) {
//                long rem = c % m;
//                res[i] = rem;
//                if (s.charAt(i) == 'L') c = c / arr[f++];
//                else c = c / arr[l--];
//            }
//            for (int i = 0; i < n; i++) pw.print(res[i] + " ");
//            pw.println();
//        }
//
//        pw.close();
//    }
//
//    static void debug(Object... obj) {
//        System.err.println(Arrays.deepToString(obj));
//    }
//}