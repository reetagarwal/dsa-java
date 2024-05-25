package BinaryTree.Tutorial;
//binary Tree from preorder and Inorder

import java.util.HashMap;

public class BTfromPreandIn {
    public static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int[] index={};
        return helper(preorder,inorder,0,preorder.length-1,map,index);
    }

    private TreeNode helper(int[] preorder, int[] inorder, int left, int right, HashMap<Integer, Integer> map,int[] index) {
        if(left>right){
            return null;
        }
        int curr=preorder[index[0]];
        index[0]++;
        TreeNode node=new TreeNode(curr);

        int inorderIndex=map.get(curr);

        if(left==right){
            return node;
        }

        node.left=helper(preorder, inorder, left, inorderIndex-1, map,index);
        node.right=helper(preorder, inorder, inorderIndex+1, right, map,index);
        return node;
    }
}
