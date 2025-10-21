import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("A1: ");
        int[] grades = {29,37,38,41,84,67};
        int[] fail = gradesManager.failingGrades(grades);
        int[] roundedGrades = gradesManager.roundedGrades(grades);
        int highestRoundedGrade = gradesManager.highestRoundedGrade(grades);
        double average = gradesManager.averageGrade(grades);
        System.out.println("Nicht ausreichende Noten: " + Arrays.toString(fail));
        System.out.println("Das Durchschnitt der Noten: " + average);
        System.out.println("Aufgerundete Noten: " + Arrays.toString(roundedGrades));
        System.out.println("Groesste aufgerundete Note: " + highestRoundedGrade);

        System.out.println("A2: ");
        int[] array = {4,8,3,10,17};
        int n = 5;
        int maxNr = numbersManager.biggestNumber(array, n);
        int minNr = numbersManager.smallestNumber(array, n);
        int maxSumMinusOne = numbersManager.maxSumMinusOne(array, n);
        int minSumMinusOne = numbersManager.minSumMinusOne(array, n);
        System.out.println("Maximale Zahl: " + maxNr);
        System.out.println("Minimale Zahl: " + minNr);
        System.out.println("Maximale Summe von n-1: " + maxSumMinusOne);
        System.out.println("Minimale Summe von n-1: " + minSumMinusOne);


    }
}