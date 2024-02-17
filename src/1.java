//import java.io.*;
//import java.util.*;
//
///*
//    Problem: A
// */
//
//public class Main {
//
//    private final static boolean LEFT_TO_RIGHT = true;
//    private final static boolean RIGHT_TO_LEFT = false;
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        PrintWriter pw = new PrintWriter(System.out);
//
//
//        List<int[]> li = printPermutation(4);
//        pw.println("\n\n\n\n\n");
//        //System.out.println(Arrays.toString(li.get(6)));
//        ;
//
//
//        pw.close();
//    }
//
//    static void debug(Object... obj) {
//        System.err.println(Arrays.deepToString(obj));
//    }
//
//    public static List<int[]> printPermutation(int n) {
//        int[] a = new int[n];
//        List<int[]> li = new ArrayList<>();
//        boolean[] dir = new boolean[n];
//
//        for (int i = 0; i < n; i++) {
//            a[i] = i + 1;
//        }
//        li.add(a);
//
//        for (int i = 0; i < n; i++)
//            dir[i] = RIGHT_TO_LEFT;
//
//        for (int i = 1; i < fact(n); i++) {
//            //li.add(printOnePerm(a, dir, n));
//            int[] arr = printOnePerm(a, dir, n);
//            for (int j = 0, k = 0; j < n; j++, k++) {
//                //if(arr[j] )
//            }
//        }
//        return li;
//    }
//
//
//    public static int searchArr(int a[], int n, int mobile) {
//        for (int i = 0; i < n; i++)
//            if (a[i] == mobile)
//                return i + 1;
//        return 0;
//    }
//
//    public static int getMobile(int a[], boolean dir[], int n) {
//        int mobile_prev = 0, mobile = 0;
//        for (int i = 0; i < n; i++) {
//            if (dir[a[i] - 1] == RIGHT_TO_LEFT && i != 0) {
//                if (a[i] > a[i - 1] && a[i] > mobile_prev) {
//                    mobile = a[i];
//                    mobile_prev = mobile;
//                }
//            }
//            if (dir[a[i] - 1] == LEFT_TO_RIGHT && i != n - 1) {
//                if (a[i] > a[i + 1] && a[i] > mobile_prev) {
//                    mobile = a[i];
//                    mobile_prev = mobile;
//                }
//            }
//        }
//
//        if (mobile == 0 && mobile_prev == 0)
//            return 0;
//        else
//            return mobile;
//    }
//
//    public static int[] printOnePerm(int[] a, boolean[] dir, int n) {
//        int mobile = getMobile(a, dir, n);
//        int pos = searchArr(a, n, mobile);
//
//        if (dir[a[pos - 1] - 1] == RIGHT_TO_LEFT) {
//            int temp = a[pos - 1];
//            a[pos - 1] = a[pos - 2];
//            a[pos - 2] = temp;
//        } else if (dir[a[pos - 1] - 1] == LEFT_TO_RIGHT) {
//            int temp = a[pos];
//            a[pos] = a[pos - 1];
//            a[pos - 1] = temp;
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (a[i] > mobile) {
//                if (dir[a[i] - 1] == LEFT_TO_RIGHT)
//                    dir[a[i] - 1] = RIGHT_TO_LEFT;
//
//                else if (dir[a[i] - 1] == RIGHT_TO_LEFT)
//                    dir[a[i] - 1] = LEFT_TO_RIGHT;
//            }
//        }
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++)
//            System.out.print(a[i] + " ");
//
//        System.out.print("\t");
//        return a;
//    }
//
//    public static int fact(int n) {
//        int res = 1;
//
//        for (int i = 1; i <= n; i++)
//            res = res * i;
//        return res;
//    }
//
//
//}