class Solution {
    long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long c=0;
        for(int i=0;i<nums.length;i++){
            long low = bound(nums,i+1,nums.length-1,lower-nums[i]);
            long up= bound(nums,i+1,nums.length-1,upper-nums[i]+1);
            c+=(up-low);
        }
        return c;
    }
    long bound(int []nums,int left,int right,int target){
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}
