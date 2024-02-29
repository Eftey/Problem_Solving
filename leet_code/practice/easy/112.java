
/*
    Problem: Path Sum
    1) If the tree is empty then false
    2) If there aren't any leaf node then return root == k if equal then true else false
    3) And finally we find the sum from either left or right node.
    4) Here we subtract each value of those nodes from k thus eventually setp 2 will occur.
*/



public static boolean hasPathSum(TreeNode root, int k) {
    if (root == null) return false;
    if (root.left == null && root.right == null) return root.val == k;
    return hasPathSum(root.left, k - root.val) || hasPathSum(root.right, k - root.val);
}