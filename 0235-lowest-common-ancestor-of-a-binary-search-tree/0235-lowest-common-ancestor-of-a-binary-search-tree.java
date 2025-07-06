/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 이진 트리, 두개의 주어진 treenode의 공통 노드를 찾자
        //이진트리 depth0부터 해서 값들을 가지고 있다가, 
        while(root != null) { // 이렇게 했을때 없어지나?
            if(root.val > p.val && root.val > q.val) { //둘다 왼쪽에 있는것
                root = root.left; //왼쪽에 있는것이므로 왼쪽걸 찾는다.
            } else if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return root;
    }
}