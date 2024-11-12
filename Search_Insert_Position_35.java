public class Search_Insert_Position_35 {
    public int searchInsert(int[] arr, int target) {
        int len =arr.length;
        int left =0;
        int right=len;
        
        if(target>arr[len-1]){
            return len;
        }
        while(left<=right){
            int mid=(right+left)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        
    }
}
