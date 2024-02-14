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
//
//        for (int tt = 0; tt < t; tt++) {
//            int n = in.nextInt();
//            //int[] arr = new int[n];
//            List<Integer> arr = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                arr.add(in.nextInt());
//            }
//
//            int ptr = 0, ptr1 = n - 1;
//            while (Objects.equals(arr.get(ptr), arr.getFirst())) ++ptr;
//            while (Objects.equals(arr.get(ptr1), arr.get(n - 1))) --ptr1;
//            if (n == 1) {
//                pw.println(0);
//                continue;
//            }
//            if (!Objects.equals(arr.getFirst(), arr.getLast())) {
//                pw.println(Math.min(n - ptr, ptr1 + 1));
//                continue;
//            }
//            pw.println(Math.max(0, ptr1 - ptr + 1));
//        }
//        pw.close();
//    }
//
//    static void debug(Object... obj) {
//        System.err.println(Arrays.deepToString(obj));
//    }
//}