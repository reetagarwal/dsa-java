//LeetCode: 199

package BinaryTree.Tutorial;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize=q.size();
            for(int i=0;i<levelSize;i++) {
                TreeNode currNode = q.poll();
                if (i == levelSize - 1) {
                    result.add(currNode.val);
                }
                if (currNode.left != null) {
                    q.offer(currNode.left);
                }
                if (currNode.right != null) {
                    q.offer(currNode.right);
                }
            }
        }
        return result;
    }
}
