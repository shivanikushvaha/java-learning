package week10.day65;

public class ConvertSortedArrayToBinaryTree {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        System.out.println();
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return null;
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
