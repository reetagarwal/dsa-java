package BinaryTree.Tutorial;
import OOPS.Abstract;

import java.util.*;
public class VerticalOrder {
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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return null;
        }
        int col=0;

        Queue<Map.Entry<TreeNode,Integer>> q=new ArrayDeque<>();
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();

        q.offer(new AbstractMap.SimpleEntry<>(root,col));
        //AbstractMap.SimpleEntry<K, V> is a nested class within the AbstractMap class in the Java Collections Framework.
        // It represents a key-value pair, similar to an entry in a map.

        int min=0;
        int max=0;

        while (!q.isEmpty()){
            Map.Entry<TreeNode,Integer> removed=q.poll();
            root=removed.getKey();
            col=removed.getValue();

            if(root!=null){
                if(!map.containsKey(col)){
                    map.put(col,new ArrayList<Integer>());
                }

                map.get(col).add(root.val);

                min=Math.min(min,col);
                max=Math.max(max,col);

                q.offer(new AbstractMap.SimpleEntry<>(root.left,col-1));
                q.offer(new AbstractMap.SimpleEntry<>(root.right,col+1));
            }
        }
        for(int i=min;i<=max;i++){
            ans.add(map.get(i));
        }
        return ans;
    }
}
