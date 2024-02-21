//#include <bits/stdc++.h>
//
//using namespace std;
//
//#define int long long int
//
//signed main() {
//    ios_base::sync_with_stdio(false);
//    cin.tie(NULL);
//    int t = 1;
//    cin >> t;
//    while (t--) {
//        int n;
//        cin >> n;
//        int cnt = 0, pos = 0;
//        for (int i = 31; i >= 0; i--) {
//            if (n & 1LL << i) {
//                if (pos == 0) pos = i;
//                if (cnt == 0 or cnt == 2) cnt++;
//            } else if (cnt == 1) cnt = 2;
//        }
//        if (cnt != 3) {
//            cout << 0 << endl;
//            continue;
//        }
//        int curnum = 0, ans = 1e18;
//        for (int i = pos; i >= 0; i--) {
//            curnum = curnum + pow(2, i);
//            if (curnum < n) continue;
//            ans = min(ans, curnum - n);
//        }
//        cout << ans << endl;
//    }
//}
