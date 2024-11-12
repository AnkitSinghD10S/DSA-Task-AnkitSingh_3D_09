public class Reverse_String_344 {
    public static void reverseString(char[] s) {
        int len = s.length;
        for(int i=0;i<=(len-2)/2;i++){
            char temp =s[i];
            s[i] =s[len-1-i];
            s[len-1-i]= temp;
        }
        for(int i=0;i<len;i++){
            System.out.print(s[i]);
        }
        return;
    }
    public static void main(String[ ] args){
        char ch[]={'h','e','l','l','o'};
        reverseString(ch);
    }
}
