package array;

public class Min1 {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if(array[index]<min){
                min = array[index];
            }
        }
        return min;
    }
}
