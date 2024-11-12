public class Sort_the_People_2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        int len =heights.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(heights[i]<heights[j]){
                    int temp = heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                    String s = names[i];
                    names[i]=names[j];
                    names[j]=s;
                }
            }
        }
        return names;
    }
}
