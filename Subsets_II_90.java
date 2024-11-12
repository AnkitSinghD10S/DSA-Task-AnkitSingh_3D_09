/*Given an integer array nums that may contain duplicates, return all possible 
subsets(the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.
Example 1:
Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
Example 2:
Input: nums = [0]
Output: [[],[0]] */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_II_90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        arraySubDuplicate(nums,new ArrayList<>(),ans,0);
        return ans;
    }
    public void arraySubDuplicate(int nums[],List<Integer> temp ,List<List<Integer>> ans,int idx){
        ans.add(new ArrayList<>(temp));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            arraySubDuplicate(nums,temp,ans,i+1);
            temp.remove(temp.size()-1);
        }
    }

    //another approach
    public void gen(int []arr,List<List<Integer>> list,List<Integer> temp,int idx){
        if(idx==arr.length){
            if(!list.contains(temp)){
                list.add(new ArrayList<>(temp));
            }
            return;
        }
        temp.add(arr[idx]);
        gen(arr,list,temp,idx+1);
        temp.remove(temp.size()-1);
        gen(arr,list,temp,idx+1);
    }
}
