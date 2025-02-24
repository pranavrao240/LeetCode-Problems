class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] positions = new int[2];
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            result = nums[i] +nums[i+1];
            if(result == target){
                positions[0]=i;
                System.out.println("values are :"+positions[0]);
                
                positions[1]=i+1;
                System.out.println("values are :"+(positions[1]));
                return positions;
                
                            }
                            System.out.println(result);
                            
                        }
                        return positions;
    }
}