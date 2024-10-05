package invert_binary_tree;

import java.util.LinkedList;
import java.util.Queue;

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

        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(9);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        printLevels(node1);
        invertTree(node1);
        printLevels(node1);
    }

    public static void printLevels(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                System.out.print(current.val + " ");

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            System.out.println();
        }
    }
        public static TreeNode invertTree (TreeNode root){
            if (root == null) return null;

            TreeNode right = invertTree(root.right);
            TreeNode left = invertTree(root.left);

            root.right = left;
            root.left = right;

            return root;
        }
}
