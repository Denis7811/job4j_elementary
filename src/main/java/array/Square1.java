package array;

public class Square1 {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i]=i*i;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(5);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
