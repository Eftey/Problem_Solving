//
//public static long getPdtUtil(Long[] st, long ss, long se, long qs, long qe, int si) {
//    long mod = 1000000007;
//    if (qs <= ss && qe >= se) return st[si];
//    if (se < qs || ss > qe) return 1;
//    long mid = getMid(ss, se);
//    return (getPdtUtil(st, ss, mid, qs, qe, 2 * si + 1) % mod *
//            getPdtUtil(st, mid + 1, se, qs, qe, 2 * si * 2) % mod) % mod;
//}
//
//private static long getMid(long s, long e) {
//    return s + (e - s) / 2;
//}
//
//public static long constructST(long[] arr, long n) {
//    long x = (long) (Math.ceil(Math.log1p(n)));
//    int max_size = 2 * (int) Math.pow(2, x) - 1;
//    long[] st = new long[max_size];
//
//    constructSTUtil(arr, 0, n-1, st, 0);
//}
