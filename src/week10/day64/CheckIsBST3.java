package week10.day64;

public class CheckIsBST3 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        boolean binary = isBinary(root);
        System.out.println(binary);
    }

    static TreeNode prev;

    private static boolean isBinary(TreeNode root) {
        if (root != null) {
            if (!isBinary(root.left))
                return false;

            if (prev != null && prev.data > root.data)
                return false;

            prev = root;

            return isBinary(root.right);
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
