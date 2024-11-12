public class Sum_Root_to_Leaf_Numbers_129 {
    public int sumNumbers(TreeNode root) {
        gen(root,0);
        return sum;
    }
    private int sum=0;
    private  void gen(TreeNode root,int s){
        if(root== null) return ;
        if(root.left==null && root.right==null){
            sum+=s*10 + root.val;
            System.out.println(sum);
            return ;
        }
        gen(root.left, s*10 + root.val);
        gen(root.right, s*10 + root.val);
    }
}
