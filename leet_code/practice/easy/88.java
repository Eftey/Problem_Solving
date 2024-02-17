import java.io.*;
import java.util.*;

/*
    Problem: Merge Sorted Array
    1) Here we sort the array in reverse
    2) We start off with the last element in both arrays
    3) Then check if one is greater than the other one or not
    4) We store the largest value into the first array and decrease its index
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int[] arr1 = {1, 2, 3, 0, 0, 0}, arr2 = {2, 5, 6};
        merge(arr1, 3, arr2, 3);
        pw.close();
    }

    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        for (int i = m - 1, j = n - 1, x = m + n - 1; j >= 0; ) {
            if (i >= 0 && arr1[i] > arr2[j]) arr1[x--] = arr1[i--];
            else arr1[x--] = arr2[j--];
        }
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}