package BinaryTree.Tutorial;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Successor {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {

        }
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode findSuccessor(TreeNode root,int key){
        if(root==null){
            return null;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int levelSize=q.size();
            TreeNode currNode=q.poll();
            if(currNode.left!=null){
                q.offer(currNode.left);
            }
            if(currNode.right!=null){
                q.offer(currNode.right);
            }
            if(currNode.val==key){
                break;
            }
        }
        return q.peek();
    }
}
