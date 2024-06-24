package week8.day55;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        List<Integer> list = rightSideView(root);
        System.out.println(list);
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        preOrder(root, 1, result);

        return result;
    }

    private static void preOrder(TreeNode root, int level, List<Integer> result) {
        if (root == null)
            return;

        if (result.size() < level)
            result.add(root.val);

        preOrder(root.right, level + 1, result);
        preOrder(root.left, level + 1, result);
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
