/*
    Problem: Maximum Depth of Binary Tree
    1) We just traverse through the tree and add +1 every time it goes deeper into to tree
*/



public static int maxDepth(TreeNode root) {
    if(root == null) return 0;
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
}