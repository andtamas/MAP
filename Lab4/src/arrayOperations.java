public class arrayOperations {
    public static int[] sumArrays(int[] x, int[] y) {
        int[] summation = new int[x.length + 1];
        int addToNext = 0;
        for (int i = x.length - 1; i>=0; i--) {
            int sum = x[i] + y[i] + addToNext;
            if (sum > 9) {
                summation[i+1]=sum-10;
                addToNext = 1;
            } else {
                summation[i+1] = sum;
                addToNext = 0;
            }
        }
        if (addToNext == 0) {
            int[] result = new int[x.length];
            for (int i=0; i<x.length; i++) {
                result[i]=summation[i+1];
            }
            return result;
        }
        int[] result = summation;
        result[0]=addToNext;
        return result;
    }

    public static int[] diffArrays(int[] x, int[] y) {
        int[] difference = new int[x.length + 1];
        int subtractFromNext = 0;
        for (int i = x.length - 1; i>=0; i--) {
            int diff = x[i] - y[i] - subtractFromNext;
            if (diff < 0) {
                difference[i+1]=diff+10;
                subtractFromNext = 1;
            } else {
                difference[i+1] = diff;
                subtractFromNext = 0;
            }
        }

        difference[0]=subtractFromNext;
        if (difference[0] == 0) {
            int[] result = new int[x.length];
            for (int i = 0; i < x.length; i++) {
                result[i] = difference[i + 1];
            }
            return result;
        } else {
            return difference;
        }
    }

    public static int[] multiArray(int[] x, int n) {
        int addToNext = 0;
        int[] result = new int[x.length + 1];
        for (int i = x.length - 1; i>=0; i--) {
            int multiply = x[i] * n + addToNext;
            if (multiply > 9) {
                result[i+1] = multiply%10;
                addToNext = multiply/10;
            } else {
                result[i+1] = multiply;
                addToNext = 0;
            }
        }
        result[0]=addToNext;
        if (addToNext == 0) {
            int[] newResult = new int[x.length];
            for (int i=0; i<x.length; i++) {
                newResult[i]=result[i+1];
            }
            return newResult;
        }
        return result;
    }

    public static int[] divArray(int[] x, int n) {
        int[] result = new int[x.length];
        int remaining = 0;

        for (int i=0; i< x.length; i++) {
            int current = remaining*10 + x[i];
            result[i] = current/n;
            remaining = current%n;
        }
        if (result[0] == 0 && result.length > 1) {
            int[] newResult = new int[result.length - 1];
            for (int i=1; i<result.length; i++) {
                newResult[i-1] = result[i];
            }
            return newResult;
        }
        return result;
    }
}
