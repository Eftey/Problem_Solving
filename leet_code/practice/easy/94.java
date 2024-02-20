import java.io.*;
import java.util.*;

/*
    Problem: Binary Tree Inorder Traversal
    1) We used a stack to store the left values
    2) Then when there's no more values left we shift it to the right
    3) But before that, we store all the values from the stack to the list
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println((int) Math.ceil((double) in.nextInt() / (in.nextInt() * in.nextInt())));
        }
        pw.close();
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        TreeNode x = root;
        Stack<TreeNode> s = new Stack<TreeNode>();
        List<Integer> xx = new ArrayList<>();

        while (x != null || !s.isEmpty()) {
            while (x != null) {
                s.push(x);
                x = x.left;
            }
            x = s.pop();
            xx.add(x.val);
            x = x.right;
        }
        return xx;
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}