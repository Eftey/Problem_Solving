//import java.io.*;
//import java.util.*;
//
///*
//    Problem: D
// */
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        PrintWriter pw = new PrintWriter(System.out);
//
//        int t = in.nextInt();
//        for (int tt = 0; tt < t; tt++) {
//            long n = in.nextLong(), m = in.nextLong();
//            List<Long> la = new ArrayList<>(), lb = new ArrayList<>();
//            for (int i = 0; i < n; i++) la.add(in.nextLong());
//            for (int i = 0; i < n; i++) lb.add(in.nextLong());
//
//            long s = 0;
//            float ans = Float.POSITIVE_INFINITY;
//            for (long i = n - 1; i >= 0; i--) {
//                if (i + 1 <= m) ans = Math.min(ans, s + la.get(i));
//                s += Math.min(la.get(i), lb.get(i));
//            }
//            pw.println((int) ans);
//        }
//
//        pw.close();
//    }
//
//    static void debug(Object... obj) {
//        System.err.println(Arrays.deepToString(obj));
//    }
//}