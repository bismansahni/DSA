//this question is from leetcode i have tried two solutions one given below and the other is commented out the question link is 
//https://leetcode.com/explore/interview/card/leetcodes-interview-crash-course-data-structures-and-algorithms/707/traversals-trees-graphs/4691/


import java.util.LinkedList;
import java.util.Queue;

public class TreeMinimum {
    public static class TreeNode {
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

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1); // create a tree
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 1;
        while (!q.isEmpty()) {
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                TreeNode node = q.remove();
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            depth++;
        }

        return depth;
    }
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     public int minDepth(TreeNode root) {
//           if (root == null) {
//             return 0;
//         }

//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
//         int depth = 1;

//         while (!q.isEmpty()) {
//             int qSize = q.size();
//             while (qSize > 0) {
//                 qSize--;
//                 TreeNode node = q.remove();

//                 // No need to check if node is null because it won't be, as per the current logic
//                 if (node.left == null && node.right == null) {
//                     return depth;
//                 }

//                 if (node.left != null) {
//                     q.add(node.left);
//                 }

//                 if (node.right != null) {
//                     q.add(node.right);
//                 }
//             }
//             depth++;
//         }
//         return -1; // This line is technically unreachable, but can be kept for completeness
//     }
// }