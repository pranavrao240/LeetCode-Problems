class Solution {
    public boolean containsDuplicate(int[] nums) {
        int flag=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    // System.out.println("True");
                    flag=1;
                }
            }
            
        }
        if(flag==0){
           return false;
        }else{
            return true;
        }
        
    }
}