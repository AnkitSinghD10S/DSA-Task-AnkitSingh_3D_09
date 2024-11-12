/*You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.
Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:
Input: nums = [1,1]
Output: [1,2]
Constraints:
2 <= nums.length <= 104
1 <= nums[i] <= 104 */
public class Set_Mismatch_645 {
    public static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }
        int []arr=new int[2];
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                arr[0]=nums[j];
                arr[1]=j+1;
            }
        }
        return arr;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
