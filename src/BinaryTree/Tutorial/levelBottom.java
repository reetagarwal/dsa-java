///Leetcode: 107

package BinaryTree.Tutorial;

import java.util.*;
public class levelBottom {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {

        }
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int levelSize=q.size();
            List<Integer> currlevel=new ArrayList<>(levelSize);

            for(int i=0;i<levelSize;i++){
                TreeNode currNode=q.poll();
                currlevel.add(currNode.val);
                if(currNode.left!=null){
                    q.offer(currNode.left);
                }
                if(currNode.right!=null){
                    q.offer(currNode.right);
                }
            }
            result.add(0,currlevel);
        }
        return result;
    }
}
