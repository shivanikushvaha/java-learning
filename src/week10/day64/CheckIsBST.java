package week10.day64;// Java program to check if a given tree is BST.

/* A binary tree node has data, pointer to
left child and a pointer to right child */
class Node {
    public int data;
    public Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
};

public class CheckIsBST {
    static int maxValue(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int value = node.data;
        int leftMax = maxValue(node.left);
        int rightMax = maxValue(node.right);

        return Math.max(value, Math.max(leftMax, rightMax));
    }

    static int minValue(Node node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        int value = node.data;
        int leftMax = minValue(node.left);
        int rightMax = minValue(node.right);

        return Math.min(value, Math.min(leftMax, rightMax));
    }

    /* Returns true if a binary tree is a binary search tree
     */
    static boolean isBST(Node node) {
        if (node == null) {
            return true;
        }

        /* false if the max of the left is > than us */
        if (node.left != null
                && maxValue(node.left) > node.data) {
            return false;
        }

        /* false if the min of the right is <= than us */
        if (node.right != null
                && minValue(node.right) < node.data) {
            return false;
        }

        /* false if, recursively, the left or right is not a
         * BST*/
        if (isBST(node.left) == false
                || isBST(node.right) == false) {
            return false;
        }

        /* passing all that, it's a BST */
        return true;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);

        // root->right->left = newNode(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        // Function call
        if (isBST(root)) {
            System.out.print("Is BST");
        } else {
            System.out.print("Not a BST");
        }
    }
}
