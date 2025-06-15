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
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // tree invert
        if(root == null) return null;
        TreeNode left =  root.left;
        TreeNode right = root.right;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(left);
        invert(right);

        return root;
    }

    private TreeNode invert(TreeNode node) {
        if(node == null) return null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(node);
        while(!stack.isEmpty()) {
            TreeNode stackNode = stack.pop(); //빼내서
            TreeNode temp = stackNode.left;
            stackNode.left = stackNode.right;
            stackNode.right = temp;

            if(stackNode.left != null) stack.push(stackNode.left);
            if(stackNode.right != null) stack.push(stackNode.right);
        }
        return node;
    }
    
}