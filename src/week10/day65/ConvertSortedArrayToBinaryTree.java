package week10.day65;

public class ConvertSortedArrayToBinaryTree {
    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode treeNode = sortedArrayToBST(nums);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        TreeNode root = null;
        return sortedArrayToBST(nums, 0, n - 1);
    }

    private static TreeNode sortedArrayToBST(int[] nums, int i, int j) {
        if (i > j) {
            return null;
        }
        int mid = i + (j - i) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, i, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, j);

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
