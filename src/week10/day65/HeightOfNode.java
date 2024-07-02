package week10.day65;

public class HeightOfNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.right = new TreeNode(10);
        root.left.right.left = new TreeNode(100);
        root.left.right.right.right = new TreeNode(1000);

        int i = heightOfNode(root);
        System.out.println(i);
    }

    public static int heightOfNode(TreeNode root) {
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
