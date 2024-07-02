package week10.day64;

public class FindMinimumInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode minimum = findMinimum(root);
        System.out.println(minimum.val);
    }

    private static TreeNode findMinimum(TreeNode root) {
        TreeNode current = root;

        while (current != null && current.left != null)
            current = current.left;

        return current;
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
