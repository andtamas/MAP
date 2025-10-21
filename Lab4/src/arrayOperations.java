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
}
