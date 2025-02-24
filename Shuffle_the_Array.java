class Shuffle_the_Array {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];  // Correct size
        
        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i];      // Place x_i
            res[2 * i + 1] = nums[i + n];  // Place y_i
        }
        
        return res;
    }

    public static void main(String[] args) {
        Shuffle_the_Array sol = new Shuffle_the_Array();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] output = sol.shuffle(nums, n);
        
        for (int num : output) {
            System.out.print(num + " ");
        }
    }
}
