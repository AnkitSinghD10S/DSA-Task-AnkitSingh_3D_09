import java.util.Arrays;
class Solution {
    public boolean check(int[] arr) {
        // boolean flag = false;
        // int len = arr.length;
        // int []arrduplicate=arr.clone();
        // Arrays.sort(arrduplicate);
        // for(int i=0;i<len;i++){
        //     int temp = arr[len-1];
        //     for(int j=len-2;j>=0;j--){
        //         arr[j+1]=arr[j];
        //     }
        //     arr[0]=temp;
        //     if(Arrays.equals(arr,arrduplicate)){
        //         flag =true;
        //     }
        // }
        // return flag;

        int val=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])val++;
        }
        if(arr[arr.length-1]>arr[0])val++;
        return val<=1;

    }
    
}
