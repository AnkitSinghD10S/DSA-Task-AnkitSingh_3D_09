public class Trapping_Rain_Water_42 {
    public int trap(int[] height) {
        int water=0;
        int []right = new int[height.length];
        int []left = new int [height.length];
        left[0]=height[0];
        for(int i=1;i<left.length;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        right[right.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        for(int i=0;i<height.length;i++){
            water+=Math.min(right[i],left[i])-height[i];
        }
        return water;
    }
}
