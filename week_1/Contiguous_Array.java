class Contiguous_Array {
    public int findMaxLength(int[] nums) {
        var map =new HashMap<Integer,Integer>();
        map.put(0,-1);
        int max=0,count=0;
        for(int i=0;i<nums.length;i++){
            count+=nums[i]==1?1:-1;
            if(map.containsKey(count)){
                max=Math.max(max,i-map.get(count));
            }else{
                map.put(count,i);
            }
        }
        return max;
    }
}
