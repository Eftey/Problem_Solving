//import java.io.*;
//import java.util.*;
//
///*
//    Problem: A
// */
//
//public class Main {
//
//    public static void main(String[] args) throws Exception {
//        Scanner in = new Scanner(System.in);
//        PrintWriter pw = new PrintWriter(System.out);
//        int t = in.nextInt();
//        String s = "Aabcdefghijklmnopqrstuvwxyz";
//
//        for (int tt = 0; tt < t; tt++) {
//            StringBuilder sb = new StringBuilder();
//            int x = in.nextInt();
//            if (x < 28) {
//                sb.append("aa");
//                sb.append(s.charAt(x - 2));
//            } else if (x > 28 && x <= 53) {
//                sb.append("a");
//                sb.append(s.charAt(x - 27));
//                sb.append("z");
//            } else if (x > 53) {
//                sb.append(s.charAt(x - 52));
//                sb.append("zz");
//            }
//            pw.println(sb.toString());
//        }
//        pw.close();
//    }
//
//    static void debug(Object... obj) {
//        System.err.println(Arrays.deepToString(obj));
//    }
//}