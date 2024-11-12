public class Two_Sum_oNComplexity {
    public static int[] twoSum(int[] arr, int target) {
        int i=0;
        for(int j=1;j<arr.length;j++){
        if(arr[j]<arr[i]){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        i++;
        }
        int ans[]=new int [2];
        int left=0,right=arr.length-1;
        while(right>left){
            int sum =arr[right]+arr[left];
            if(sum==target){
                ans[0]=left;
                ans[1]=right;
                break;
            }
            if(sum>target){
                right--;
            }
            if(sum<target){
                left++;
            }
        }
        return ans;
    }
    
}
