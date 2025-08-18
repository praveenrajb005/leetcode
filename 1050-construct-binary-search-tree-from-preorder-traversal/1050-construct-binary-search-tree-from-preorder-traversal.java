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
    int j=1;
    public void rec(TreeNode root,int[] pre,int l){
        //for(int i=0;i<pre.length;i++){
            if(j==l) return;
            if(pre[j]<root.val){
                if(root.left==null){
                root.left=new TreeNode(pre[j]);
                j+=1;
                }
                 else rec(root.left,pre,l);
            }
            else{
                if(root.right==null){
                root.right=new TreeNode(pre[j]);
                j+=1;
                }
                else rec(root.right,pre,l);
            }
       // }

    }
    public TreeNode bstFromPreorder(int[] pre) {
        TreeNode root=new TreeNode(pre[0]);
        while(j<pre.length){
        rec(root,pre,pre.length);
        }
        return root;
        
    }
}