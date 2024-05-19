//leetcode : 103 - google , amazon , microsoft

package BinaryTree.Tutorial;

import java.util.*;


public class Zigzag {
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
            Deque<TreeNode> q=new LinkedList<>();
            q.offer(root);

            boolean reverse=false;

            while(!q.isEmpty()){
                int levelSize=q.size();
                List<Integer> currlevel=new ArrayList<>(levelSize);

                for(int i=0;i<levelSize;i++){
                    if(!reverse){
                        TreeNode currNode=q.pollFirst();
                        currlevel.add(currNode.val);
                        if(currNode.left!=null){
                            q.addLast(currNode.left);
                        }
                        if(currNode.right!=null){
                            q.addLast(currNode.right);
                        }
                    }
                    else{
                        TreeNode currNode=q.pollLast();
                        currlevel.add(currNode.val);
                        if(currNode.right!=null){
                            q.addFirst(currNode.right);
                        }
                        if(currNode.left!=null){
                            q.addFirst(currNode.left);
                        }
                    }
                }
                reverse=!reverse;//just flipping
                result.add(currlevel);
            }
            return result;

    }
}
