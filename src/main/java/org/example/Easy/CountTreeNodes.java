package org.example.Easy;

public class CountTreeNodes {

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
    int count = 0;

    public int countNodes(TreeNode root) {
        if (root == null) {
            count = 0;
        } else {
            count = 1 + countNodes(root.left) + countNodes(root.right);
        }
        return count;
    }
}
