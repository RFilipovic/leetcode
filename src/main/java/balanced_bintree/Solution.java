package balanced_bintree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(3);

        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);

        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;

        node3.left = node4;
        node3.right = node5;

        System.out.println(isBalanced(node1));
    }

    public static boolean isBalanced(TreeNode root) {
        return countDepth(root) != -1;
    }

    public static int countDepth(TreeNode root) {
        if(root == null) return 0;

        int left = countDepth(root.left);
        int right = countDepth(root.right);

        if(left == -1 || right == -1) return -1;
        if(Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }

}
