public class Sum_of_Square_Numbers_633 {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j=(long) Math.sqrt(c);
        while(i<=j){
            if((i*i)+(j*j)==c){
                return true;
            }
            if((i*i)+(j*j)>c){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
