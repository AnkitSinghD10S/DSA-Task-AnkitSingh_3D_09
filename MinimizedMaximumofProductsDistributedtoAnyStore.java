class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int i=1;
        int j=0;
        for(int k:quantities){
            j=Math.max(j,k);
        }
        int ans=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(fun(n,quantities,mid)<=n){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }
    public int fun(int n,int []arr,int mid){
        int c=0;
        for(int i:arr){
            c+=(i+(mid-1))/mid;
        }
        return c;
    }
}
