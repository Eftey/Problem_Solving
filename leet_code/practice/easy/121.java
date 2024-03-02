/*
    Problem: Best Time to Buy and Sell Stock
    1) First we find the minimum_price
    2) Then we find the profit which is the maximum value of current profit vs current_price - minimum_price
 */


public static int maxProfit(int[] arr) {
    int rem = arr[0], prof = 0;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < rem) rem = arr[i];
        else prof = Math.max(prof, arr[i] - rem);
    }
    return prof;
}