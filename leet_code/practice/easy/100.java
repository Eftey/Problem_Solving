import java.io.*;
import java.util.*;

/*
    Problem: Same Tree
    1) We check for null values then check if left and rigfht are the same or not
    2) If so then we return false else return true
 */

public static boolean isSameTree(TreeNode x, TreeNode xx) {
    if (x == null && xx == null) return true;
    if (x == null || xx == null) return false;
    if (x.val != xx.val) return false;
    return isSameTree(x.left, xx.left) && isSameTree(x.right, xx.right);
}