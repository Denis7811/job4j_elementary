package array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean standard = data[0];
        for (int j = 1; j < data.length; j++) {
                if (standard != data[j]) {
                result = false;
                break;
            }
        }
        return result;
        }
    }
