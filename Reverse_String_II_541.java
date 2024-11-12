public class Reverse_String_II_541{

    // public static String reverseStr(String s, int k) {
    //     String ans="";
    //     int len = s.length();
    //     int idx=0;
    //     if(len<k){
    //         return s;
    //     }
    //     while(idx<=len-1){
    //         String s2="";
    //         String s1 = s.substring(idx,idx+k);
    //         if(idx+(2*k)>len-1){
    //             s2= s.substring(idx+k,len);
    //         }
    //         if(idx+(2*k)<=len-1){
    //             s2= s.substring(idx+k,idx + (2*k));
    //         }
    //         for(int i=s1.length()-1;i>=0;i--){
    //             ans+=s1.charAt(i);
    //         }
    //         ans+=s2;
    //         idx=ans.length();
    //     }
    //     return ans;
    // }
    public static String reverseStr(String s, int k) {
        char []arr =s.toCharArray();
        int len =s.length();
        for(int i=0;i<len;i+=2*k){
            int left = i;
            int right = Math.min(i+k-1,len-1);
                while(left<right){
                    char temp= arr[left];
                    arr[left++] = arr[right];
                    arr[right--]=temp;
                }
            }
         String s1= new String(arr);  
        return s1;
        }

    public static void main(String []args){
        String s= "abxdefgh";
        int k=3;
        System.out.println(reverseStr(s,k));
    }
}