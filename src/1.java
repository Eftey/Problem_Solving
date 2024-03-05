//import java.util.*;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            solve();
//        }
//    }
//
//    public static void solve() {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[100005];
//        Map<Integer, Integer> vis = new HashMap<>();
//        for (int i = 1; i <= n; i++) {
//            a[i] = sc.nextInt();
//            vis.put(a[i], vis.getOrDefault(a[i], 0) + 1);
//        }
//        int mex = 0;
//        while (vis.containsKey(mex)) {
//            mex++;
//        }
//        if (mex == 0) {
//            System.out.println(n);
//            for (int i = 1; i <= n; i++) {
//                System.out.println(i + " " + i);
//            }
//            return;
//        }
//        Map<Integer, Integer> now = new HashMap<>();
//        int cmex = 0;
//        List<Pair<Integer, Integer>> ans = new ArrayList<>();
//        int lst = 1;
//        for (int i = 1; i <= n; i++) {
//            now.put(a[i], now.getOrDefault(a[i], 0) + 1);
//            while (now.containsKey(cmex)) {
//                cmex++;
//            }
//            if (cmex == mex) {
//                ans.add(new Pair<>(lst, i));
//                lst = i + 1;
//                now.clear();
//                cmex = 0;
//            }
//        }
//        if (ans.get(ans.size() - 1).getValue() != n) {
//            ans.get(ans.size() - 1).setValue(n);
//        }
//        if (ans.size() == 1) {
//            System.out.println(-1);
//        } else {
//            System.out.println(ans.size());
//            for (Pair<Integer, Integer> p : ans) {
//                System.out.println(p.getKey() + " " + p.getValue());
//            }
//        }
//    }
//}
//
