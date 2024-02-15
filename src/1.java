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
//            int x = in.nextInt(), sum = 0;
//            int[] arr = new int[x];
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = in.nextInt();
//            }
//            Arrays.sort(arr);
//            for (int i = 1; i < arr.length; i++) {
//                sum += arr[i] - arr[i - 1];
//            }
//            pw.println(sum);
//        }
//
//        pw.close();
//    }
//
//    static void debug(Object... obj) {
//        System.err.println(Arrays.deepToString(obj));
//    }
//}