public class Maximum_and_minimum_of_an_array {
    public static void main(String[] args) {
        int[] array = {3,4,2,7,1};int temp=0;

        for (int i = 0; i < array.length; i++) {
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j])
                {
                    temp  = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }

            }
            // System.out.println(array[i]);
            
            
            
        }
        System.out.println("Minimum: "+array[0]);
        System.out.println("Max: "+array[(array.length)-1]);
    }
}
