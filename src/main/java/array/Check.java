package array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean i : data) {
            boolean standard = data[0];
            if (standard != i) {
                result = false;
                break;
            }
        }
        return result;
        }
    }
