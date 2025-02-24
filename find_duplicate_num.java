class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}

// public class find_duplicate_num {
//     public static void main(String[] args) {
//         int[] arr = {1,3,4,2,2};
//         int key;
//         for (int i = 0; i < arr.length; i++) {
//             key = arr[i];
//             {
//                 for (int j = i + 1; j < arr.length; j++) {
//                     if(key == arr[j]){
//                         System.out.println("Duplivate ele found");
//                     }
//                 }
//             }

            
//         }

//     }
// }
