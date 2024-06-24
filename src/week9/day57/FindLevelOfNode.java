package week9.day57;

public class FindLevelOfNode {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        findLevelOfNode(root);
    }

    private static void findLevelOfNode(TreeNode root) {
        for (int x = 1; x < 7; x++) {
            int level = getLevel(root, x);
            if (level != 0)
                System.out.println("Level is : " + level);
            else
                System.out.println("Level not found");
        }
    }

    private static int getLevel(TreeNode root, int x) {
        return getLevelUtil(root, x, 1);
    }

    private static int getLevelUtil(TreeNode root, int data, int level) {
        if (root == null)
            return 0;

        if (data == root.val)
            return level;

        int downLevel = getLevelUtil(root.left, data, level + 1);
        if (downLevel != 0)
            return downLevel;

        return getLevelUtil(root.right, data, level + 1);
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
