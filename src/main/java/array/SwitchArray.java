package array;

public class SwitchArray {

    public static int[] swap(int[] array, int source, int dest) {
        int temp1 = array[source];
        array[source] = array[dest];
        array[dest] = temp1;
        return array;
    }

    public static String[] swapString(String[] array, int source, int dest) {
        String temp1 = array[source];
        array[source] = array[dest];
        array[dest] = temp1;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index : rsl) {
            System.out.println(index);
        }
        System.out.println("swap");
        int[] numsSwap = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl1 = swap(nums, 0, 2);
            for (int index : rsl) {
                System.out.println(index);
        }
        System.out.println("swapString");
        String[] arrayString = new String[] {"nole", "one", "two", "three"};
        String[]  arrayString1= swapString(arrayString,1,3);
        for (String index : arrayString1) {
            System.out.println(index);
        }
    }
}
