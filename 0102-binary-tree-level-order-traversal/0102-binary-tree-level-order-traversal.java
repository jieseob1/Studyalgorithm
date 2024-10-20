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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        if(root == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> sameLevelList = new ArrayList<>();
            //1.꺼내서 left,right 있는지 확인하고 있는 경우에는 queue에다가 넣는다.
            //2. queue에서 해당 정보들을 꺼내서 for문을 돌면서 같은 레벨에 있는 정보들을 모두 넣고, 또한 leaf정보들을 queue에 다 넣는다.
            for ( int i = 0 ; i < size ; i++) {
                TreeNode node = queue.poll();
                sameLevelList.add(node.val);
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            list.add(sameLevelList);

        }
        return list;
    }
}