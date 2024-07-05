package week10.day65;

public class IsSymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        isSymmetric(root);
    }

    public static boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private static boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;

        int temp = p.val;
        p.val = q.val;
        q.val = temp;

        if (p == null || q == null || p.val != q.val)
            return false;

        return isSymmetric(p.left, q.left) && isSymmetric(p.right, p.right);
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
