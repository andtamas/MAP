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

    public static double averageGrade(int[] grades) {
        int sum = 0;
        for (int i=0; i<grades.length; i++) {
            sum += grades[i];
        }
        double result = (double)sum/grades.length;
        return Math.round(result * 100)/100.0;
    }

    public static int[] roundedGrades(int[] grades) {
        int[] result = new int[grades.length];
        for (int i=0; i<grades.length; i++) {
            if (grades[i] % 5 != 0) {
                int nextMultiple5 = (grades[i]/5 + 1) * 5;
                if (nextMultiple5 - grades[i] < 3) {
                    result[i] = nextMultiple5;
                } else {
                    result[i] = grades[i];
                }
            } else {
                result[i] = grades[i];
            }
        }
        return result;
    }

    public static int highestRoundedGrade(int[] grades) {
        int[] roundedGrades = roundedGrades(grades);
        int max = 0;
        for (int i=0; i<roundedGrades.length; i++) {
            if (roundedGrades[i] > max) {
                max = roundedGrades[i];
            }
        }
        return max;
    }
}