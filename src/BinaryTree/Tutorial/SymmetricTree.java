//LeetCode:103(Symmetric Tree)

package BinaryTree.Tutorial;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
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

    public boolean isSymmetric(TreeNode root) {//O(n)
        Queue<TreeNode> q=new LinkedList<>();

        q.add(root.left);
        q.add(root.right);

        while (!q.isEmpty()){
            TreeNode left=q.poll();
            TreeNode right=q.poll();

            if(left==null && right==null){
                continue;
            }

            if(left==null || right==null){
                return false;
            }

            if(left.val!= right.val ){
                return false;
            }
            q.add(left.left);
            q.add(right.right);
            q.add(left.right);
            q.add(right.left);
        }
        return true;
    }
}
