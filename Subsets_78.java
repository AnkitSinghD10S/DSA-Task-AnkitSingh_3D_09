/*Given an integer array nums of unique elements, return all possible subsets(the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.
Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:
Input: nums = [0]
Output: [[],[0]] */

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        arraySubset(nums,new ArrayList<>() ,ans,0);
        return ans;
    }
    public void arraySubset(int []nums,List<Integer> temp,List<List<Integer>> ans,int idx){
        ans.add(new ArrayList<>(temp));
        for(int i=idx;i<nums.length;i++){
            temp.add(nums[i]);
            arraySubset(nums,temp,ans,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
