package array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int i = (index + 1); i < array.length; i++) {
                    if (array[i] != null) {
                        int notNullIndex = i;
                        SwitchArray.swapString(array, point, notNullIndex);
                        break;
                    }
                }
            }
        }
        return array;
    }
}
