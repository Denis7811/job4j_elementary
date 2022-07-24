package array;

public class PrintEvenElements1 {
    public static void main(String[] args) {
        int[] numbers = {1,  3,  5,  7, 8, 9, 10, 11, 12};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[numbers.length - 1 - i]%2 != 0){
            System.out.println(
                    "четный элемент: "
                            + numbers[numbers.length - 1 - i]
            );
        }
    }
}
    }
