public class electronicsBudgeting {
    public static int cheapestKeyboard(int[] pricesKeyboard) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<pricesKeyboard.length; i++) {
            if (pricesKeyboard[i] < min) {
                min = pricesKeyboard[i];
            }
        }
        return min;
    }

    public static int mostExpensiveObject(int[] pricesKeyboard, int[] pricesUnit) {
        int maxKeyboard = 0;
        for (int i=0; i<pricesKeyboard.length; i++) {
            if (pricesKeyboard[i]>maxKeyboard) {
                maxKeyboard = pricesKeyboard[i];
            }
        }
        int maxUnit = 0;
        for (int i=0; i<pricesUnit.length; i++) {
            if (pricesUnit[i]>maxUnit) {
                maxUnit = pricesUnit[i];
            }
        }
        if (maxKeyboard > maxUnit) {
            return maxKeyboard;
        }
        return maxUnit;
    }
}
