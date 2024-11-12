/* Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.
Example 1:
Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
Example 2:
Input: nums = [1,2,3], k = 0
Output: 0
Constraints:
1 <= nums.length <= 3 * 104
1 <= nums[i] <= 1000
0 <= k <= 106*/
public class Subarray_Product_Less_Than_K_713 {
    // Brute force (TLE)
    public int numSubarrayProductLessThanK1(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=i;j<nums.length;j++){
                if(product*nums[j]<k){
                    count++;
                    product*=nums[j];
                    System.out.println(product);
                }else{
                    break;
                }
            }
        }
        return count;
    }
    // sliding window approch
    public int numSubarrayProductLessThanK2(int[] nums, int k) {
        if(k<=1) return 0;
        int left=0,right=0,product =1,count =0;
        int n= nums.length;
        while(right<n){
            product*=nums[right];
            while(product>=k){
                product/=nums[left];
                left++;
            }
            count+=1+(right-left);
            right++;
        }
        return count;
    }
}
