package org.example.Easy;

import java.util.ArrayList;
import java.util.List;

public class N_aryTreePreorderTraversal {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    List<Integer> result = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root == null) return result;
        result.add(root.val);
        for (Node i : root.children) preorder(i);
        return result;
    }

    public List<Integer> postorder(Node root) {
        if (root == null) return result;
        for (Node child : root.children) {
            postorder(child);
        }
        result.add(root.val);
        return result;
    }
}
