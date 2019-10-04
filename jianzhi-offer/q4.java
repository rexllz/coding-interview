//输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
//假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。

public class q4 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return findTree(pre, 0, pre.length-1, in, 0, in.length-1);
    }
    public TreeNode findTree(int[] pre, int prestart, int preend, int[] in, int instart, int inend){
        if(prestart>preend || instart>inend)return null;
        //the first one in pre is the root
        TreeNode root = new TreeNode(pre[prestart]);
        //find the root in in list we can seperate the tree into 2 parts
        for(int i = 0; i<=inend; i++){
            if(in[i] == pre[prestart]){
                root.left = findTree(pre, prestart+1, prestart+i-instart, in, instart, i-1);
                root.right = findTree(pre, prestart+i-instart+1, preend, in, i+1, inend);
                break;
            }
        }
        return root;
    }
}
