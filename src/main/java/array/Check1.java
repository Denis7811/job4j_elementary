package array;

public class Check1 {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean check = data[0];
        for (int i = 0; i < data.length; i++) {
              if (data[i]!=check) {
              result = false;
              break;
              }
        }
        return result;
    }
}

