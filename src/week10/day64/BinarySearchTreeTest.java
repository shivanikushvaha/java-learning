package week10.day64;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode treeNode = binarySearch(root, 7);
        if (treeNode != null)
            System.out.println("Found");
        else
            System.out.println("Not found");
    }

    public static TreeNode binarySearch(TreeNode root, int target) {
        if (root == null || root.val == target)
            return root;

        if (root.val > target)
            return binarySearch(root.left, target);

        return binarySearch(root.right, target);
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
