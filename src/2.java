//import java.io.*;
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            int cnt = 0, pos = 0;
//            for (int i = 31; i >= 0; i--) {
//                if ((n & (1L << i)) != 0) {
//                    if (pos == 0) pos = i;
//                    if (cnt == 0 || cnt == 2) cnt++;
//                } else if (cnt == 1) cnt = 2;
//            }
//            if (cnt != 3) {
//                System.out.println(0);
//                continue;
//            }
//            int curnum = 0, ans = Integer.MAX_VALUE;
//            for (int i = pos; i >= 0; i--) {
//                curnum += Math.pow(2, i);
//                if (curnum < n) continue;
//                ans = Math.min(ans, curnum - n);
//            }
//            System.out.println(ans);
//        }
//        sc.close();
//    }
//}
