package week10.day65;

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int targetSum = 22;
        boolean b = hasPathSum(root, targetSum);
        System.out.println(b);
    }

    static int sum = 0;

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root != null) {
            hasPathSum(root.right, targetSum);
            sum += root.val;
        }
        System.out.println(sum);
        return sum == targetSum;
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
