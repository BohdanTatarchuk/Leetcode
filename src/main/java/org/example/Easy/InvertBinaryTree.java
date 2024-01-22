package org.example.Easy;

public class InvertBinaryTree {
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

        public TreeNode invertTree(TreeNode root) {
            TreeNode temp;
            if (root == null) {
                return null;
            } else {
                temp = root.left;
                root.left = root.right;
                root.right = temp;

                invertTree(root.left);
                invertTree(root.right);
            }
            return root;
        }
    }
}
