import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<String,Integer> people2 = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            people2.put(names[i], heights[i]);
        }
        
        for (int i = 0; i < heights.length; i++) {
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]<heights[j]){
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
                
            }
            
            System.out.println(names[i]);
            
            
        }
        return names;
        
    }
}