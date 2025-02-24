public class reverse_the_array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] temp = new int[array.length];int j=array.length-1;
        for (int i = 0;i<array.length;i++) {
            temp[i] = array[j];
            j--;
            System.out.println(temp[i]);
           
            
        }
       
    }
}
