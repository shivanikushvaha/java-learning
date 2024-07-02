package week10.day64;

public class InsertIntoBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode treeNode = insertIntoBST(root, 7);
        
        inOrderTraversal(treeNode);
    }

    private static void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    public static TreeNode insertIntoBST(TreeNode root, int target) {
        if (root == null)
            return new TreeNode(target);

        if (root.val > target)
            root.left =  insertIntoBST(root.left, target);

        root.right = insertIntoBST(root.right, target);

        return root;
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
