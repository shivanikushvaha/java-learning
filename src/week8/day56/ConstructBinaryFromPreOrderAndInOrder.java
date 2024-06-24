package week8.day56;

public class ConstructBinaryFromPreOrderAndInOrder {
    public static void main(String[] args) {
        int[] preOrder = {3, 9, 20, 15, 7};
        int[] inOrder = {9, 3, 15, 20, 7};
        TreeNode treeNode = buildTree(preOrder, inOrder);
        System.out.println(treeNode);
    }

    private static int idx = 0;

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;

        return solve(preorder, inorder, 0, n - 1);
    }

    private static TreeNode solve(int[] preorder, int[] inorder, int start, int end) {
        if (start > end)
            return null;

        int rootVal = preorder[idx++];

        int i = start;
        for (; i <= end; i++) {
            if (rootVal == inorder[i]) {
                break;
            }
        }
        idx++;
        TreeNode root = new TreeNode(rootVal);
        root.left = solve(preorder, inorder, start, i - 1);
        root.right = solve(preorder, inorder, i + 1, end);
        return root;
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
