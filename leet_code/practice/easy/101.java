/*
    Problem: Symmetric Tree
    1) We have to see if the nodes that are in the left and the right are the same or not
    2) For this we use pre-order traversal on both side of the nodes
    3) And if any of the value isn't equal to each other, then we return as false
    4) Else we continue with the search until the tree is fully traversed
*/



public static boolean preOrder(TreeNode x, TreeNode xx) {
    if (x == null || xx == null) return x == xx;
    if (x.val != xx.val) return false;
    return preOrder(x.left, xx.right) && preOrder(x.right, xx.left);

}

public static boolean isSymmetric(TreeNode root) {
    return root == null || preOrder(root.left, root.right);
}