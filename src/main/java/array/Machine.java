package array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        if (change > 0) {
            for (int i = 0; i < coins.length; i++) {
                if (change >= coins[i]) {
                    while (change - coins[i] >= coins[i]) {
                        change = change - coins[i];
                        rsl[size] = coins[i];
                        size++;
                    }
                    change = change - coins[i];
                    rsl[size] = coins[i];
                    size++;
                }
                           }
        }
        return Arrays.copyOf(rsl, size);
    }
}

