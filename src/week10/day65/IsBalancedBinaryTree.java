package week10.day65;

public class IsBalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);

        boolean balanceBinaryTree = isBalanceBinaryTree(root);
        System.out.println(balanceBinaryTree);
    }

    public static boolean isBalanceBinaryTree(TreeNode root) {
        if (root == null)
            return true;

        int lh = heightOfNode(root.left);
        int rh = heightOfNode(root.right);

        if (Math.abs(lh - rh) <= 1 && isBalanceBinaryTree(root.left) && isBalanceBinaryTree(root.right))
            return true;

        return false;
    }

    private static int heightOfNode(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + Math.max(heightOfNode(root.left), heightOfNode(root.right));
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
