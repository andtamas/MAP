public class gradesManager {
    public static int[] failingGrades(int[] grades) {
        int count = 0;
        int[] failing = new int[grades.length];

        for (int i=0; i<grades.length; i++) {
            if (grades[i]<38) {
                failing[i] = grades[i];
                count++;
            }
        }
        int[] result = new int[count];
        for (int i=0; i<count; i++) {
            result[i] = failing[i];
        }
        return result;
    }

    public static double average(int[] grades) {
        int sum = 0;
        for (int i=0; i<grades.length; i++) {
            sum += grades[i];
        }
        double result = sum/grades.length;
        return result;
    }

    public static int[] roundedGrades(int[] grades) {
        if ()
    }
}