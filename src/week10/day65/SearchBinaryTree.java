package week10.day65;

import week10.day64.InsertIntoBST;

public class SearchBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode treeNode = searchBST(root, 2);
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root != null) {
            if (val > root.val) {
                searchBST(root.right, val);
            } else if (val < root.val) {
                searchBST(root.left, val);
            } else {
                return root;
            }
        }
        return null;
    }

    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int item) {
            val = item;
            left = right = null;
        }
    }
}
