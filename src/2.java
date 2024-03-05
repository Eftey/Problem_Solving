//#include<iostream>
//#include<vector>
//
//void subSeg(int n, vector<int>&a) {
//    int maxE = 0, maxC = 0;
//    for (int i = 0; i < n; i++) {
//        if (a[i] > maxE) {
//            maxE = a[i];
//            maxC = 1;
//        } else if (a[i] == maxE) maxC++;
//    }
//    if (maxE == 0 || maxC == 1) {
//        cout << "-1\n";
//        return;
//    }
//    cout << "2\n";
//    cout << "1 " << maxC << "\n";
//    cout << maxC + 1 << " " << n << "\n";
//}
//
//
//int main() {
//    int t;
//    cin >> t;
//    while (t--) {
//        int n;
//        cin >> n;
//        vector<int> a (n);
//        for (int i = 0; i < n; i++) {
//            cin >> a[i];
//        }
//        subSeg(n, a);
//    }
//    return 0;
//}