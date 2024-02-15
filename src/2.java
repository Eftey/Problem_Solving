//import java.io.*;
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter pw = new PrintWriter(System.out);
//
//        int t = in.nextInt();
//        for (int tt = 0; tt < t; tt++) {
//            int n = in.nextInt(), k = in.nextInt(), ans = 0;
//            if (((4 * n) - 2) == k) ans = (int) Math.ceil(k / 2.0) + 1;
//            else ans = (int) Math.ceil(k / 2.0);
//            pw.println(ans);
//        }
//
//        pw.close();
//    }
//
//    static void debug(Object... obj) {
//        System.err.println(Arrays.deepToString(obj));
//    }
//}