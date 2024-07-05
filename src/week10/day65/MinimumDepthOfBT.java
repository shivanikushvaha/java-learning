package week10.day65;

public class MinimumDepthOfBT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int i = minDepth(root);
        System.out.println(i);
    }

    public static int minDepth(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null && root.right == null)
            return 1 + Math.max(minDepth(root.left), minDepth(root.right));

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
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
