package week9.day58;

import java.util.*;

public class DeleteNodeAndReturnForest {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int[] to_delete = {3, 5};
        List<TreeNode> treeNodes = delNodes(root, to_delete);
        System.out.println(treeNodes);
    }

    public static List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        SortedSet<Integer> set = new TreeSet<>();
        List<TreeNode> result = new ArrayList<>();

        for (int i : to_delete)
            set.add(i);

        deleteHelper(root, set, result);

        if (set.contains(root.val) && root.val != set.last()) {
            result.add(root);
        }
        return result;
    }

    private static TreeNode deleteHelper(TreeNode root, SortedSet<Integer> set, List<TreeNode> result) {
        if (root == null)
            return null;

        root.left = deleteHelper(root.left, set, result);
        root.right = deleteHelper(root.right, set, result);

        if (set.contains(root.val) && root.val != set.last()) {
            if (root.left != null)
                result.add(root.left);
            if (root.right != null)
                result.add(root.right);
            return null;
        } else {
            return root;
        }
    }

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
}
