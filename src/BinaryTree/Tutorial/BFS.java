//leetcode 102 problem

package BinaryTree.Tutorial;

import java.util.*;

public class BFS {

    public class TreeNode {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize= queue.size();
            List<Integer> currentLevel=new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode currNode=queue.poll();
                currentLevel.add(currNode.val);
                if(currNode.left!=null){
                    queue.offer(currNode.left);
                }
                if(currNode.right!=null){
                    queue.offer(currNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}
