package org.example.Easy;

public class UnivaluedBinaryTree {
    public static class TreeNode {
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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public boolean isUnivalTree(TreeNode root) {
        boolean left_correct = (root.left == null ||
                    (root.val == root.left.val && isUnivalTree(root.left)));
        boolean right_correct = (root.right == null ||
                    (root.val == root.right.val && isUnivalTree(root.right)));
        return left_correct && right_correct;
    }
}
