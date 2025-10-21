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

    public static int smallestNumber(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maxSumMinusOne(int[] array, int n) {
        int min = smallestNumber(array, n);
        int sum=0;
        boolean checkDuplication = false;
        for (int i=0; i<n; i++) {
            if (array[i]!=min) {
                sum += array[i];
            } else if (!checkDuplication) {
                checkDuplication = true;
            } else if (checkDuplication) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int minSumMinusOne(int[] array, int n) {
        int max = biggestNumber(array, n);
        int sum=0;
        boolean checkDuplication = false;
        for (int i=0; i<n; i++) {
            if (array[i]!=max) {
                sum += array[i];
            } else if (!checkDuplication) {
                checkDuplication = true;
            } else if (checkDuplication) {
                sum += array[i];
            }
        }
        return sum;
    }
}