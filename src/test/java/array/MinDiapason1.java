package array;

public class MinDiapason1 {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start+1; index <= finish; index++) {
            if(array[index]<min){
                min = array[index];
            }
        }
        return min;
    }
}