/*
    Problem: Balanced Binary Tree
    1) We consider 3 condition
    1.1) If there are no nodes in the root then true since both left or right is empty
    1.2) Then we traverse the tree for left nodes and right nodes
    1.3) If any of them is null we return 0
    1.4) If the subtraction of left nodes and right nodes are greater than 1 then we return false
        since it's not balance if that's the case
    1.5) Else we take the one that is greater and return +1 of the current height of the tree
    2) We do this until we traverse the entire tree
    3) If there aren't any difference between the height then we return as true
*/


boolean isBalanced = true;
public boolean isBalanced(TreeNode root) {
    if (root == null) return isBalanced;
    rightORleft(root);
    return isBalanced;
}

private int rightORleft(TreeNode root) {
    if (root == null) return 0;
    int left = rightORleft(root.left), right = rightORleft(root.right);
    if (Math.abs(left - right) > 1) isBalanced = false;
    return Math.max(left, right) + 1;
}
