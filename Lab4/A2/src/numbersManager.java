public class numbersManager {
    public static int biggestNumber(int[] array, int n) {
        int max = 0;
        for (int i=0; i<n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}