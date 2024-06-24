package week9.day57;

public class PrintAncestors {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        findAncestor(root, 4);
    }

    private static boolean findAncestor(TreeNode root, int data) {
        if (root == null)
            return false;

        if (root.val == data)
            return true;

        if (findAncestor(root.left, data) || findAncestor(root.right, data)) {
            System.out.print(root.val + " ");
            return true;
        }

        return false;
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
