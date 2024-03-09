//import java.io.*;
//import java.util.*;
//
///*
//    Problem: Anton and Letters
// */
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        PrintWriter pw = new PrintWriter(System.out);
//
//        StringTokenizer stk = new StringTokenizer(in.nextLine(), "{,} ");
//        Set<String> set = new HashSet<>();
//        while (stk.hasMoreTokens()) set.add(stk.nextToken());
//        pw.println(set.size());
//        pw.close();
//    }
//
//    static void debug(Object... obj) {
//        System.err.println(Arrays.deepToString(obj));
//    }
//}