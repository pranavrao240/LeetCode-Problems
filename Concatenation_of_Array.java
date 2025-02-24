class Solution {
    public int[] getConcatenation(int[] nums) {
        int n2=0;
        int[] ans = new int[2*nums.length];
        for(int i=0;i<2*nums.length;i++){
            if(i<nums.length){
            ans[i] = nums[i];
        }else{
            ans[i] = nums[n2];
            n2++;
        }
        System.out.println(ans[i]+" ");

            
        }
        return ans;
        
        
    }
}