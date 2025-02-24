public class KthSmallestEle {
    public static void main(String[] args) {
        int[] array = { 2, 3, 1, 20, 15 };
        int k = 4;
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }

            }
        }
        System.out.println("Kth Smallest Element : " + array[k - 1]);
        
    }
}
