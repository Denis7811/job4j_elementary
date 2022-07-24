package array;

public class SkipNegative1 {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if(array[row][cell]<0){
                    array[row][cell]=100;
                }
            }
        }
        return array;
    }
}
