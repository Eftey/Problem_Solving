//#include <bits/stdc++.h>
//using namespace std;
//
//int solve(char x, char xx) {
//    int res = 0;
//    while(x != xx) {
//        x += 3;
//        if(x > 90) {
//            x = x - 26;
//        }
//        res++;
//    }
//    return res;
//}
//
//int main() {
//    int tt;
//    cin >> tt;
//    while (tt--) {
//        int n;
//        cin >> n;
//        string x, xx;
//        cin >> x >> xx;
//        vector<int> arr(n);
//        for (int i = 0; i < x.size(); i++) {
//            arr[i] = solve(x[i], xx[i]);
//        }
//        for(auto f:arr){
//            cout << f << " ";
//        }
//        cout << endl;
//    }
//
//}