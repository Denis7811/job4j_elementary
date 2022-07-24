package array;

public class AlgoArray1 {
    public static void main(String[] args) {
        int[] array = new int[] {4, 2, 3, 1, 5};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        int[] nums = new int[2];
        nums[1]=100;
        System.out.println(nums[1]);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
