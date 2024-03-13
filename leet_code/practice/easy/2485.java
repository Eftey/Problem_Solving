import java.io.*;
import java.util.*;

/*
    Problem: Find the Pivot Integer
    1) Just use the fromula and check if the remainder is 0 or not
    2) If so then return -1 else return x
 */

public static int pivotInteger(int n) {
    double x = Math.sqrt(n * (double) (n + 1) / 2);
    if (x % 1 == 0) return -1;
    return (int) x;
}

