package week10.day64;

import java.util.ArrayList;
import java.util.List;

public class CheckIsBST2 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        List<Integer> list = new ArrayList<>();
        boolean binary = isBinary(root, list);
        System.out.println(binary);
    }

    private static boolean isBinary(TreeNode root, List<Integer> list) {
        if (root != null) {
            isBinary(root.left, list);
            list.add(root.data);
            isBinary(root.right, list);
        }

        int n = list.size() - 1;
        for (int i = 0; i < n; i++) {
            if (!(list.get(i) < list.get(i + 1)))
                return false;
        }
        return true;
    }

    static class TreeNode {
        public int data;
        public TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }
}
