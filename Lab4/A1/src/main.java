import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] grades = {29,37,38,41,84,67};
        int[] fail = gradesManager.failingGrades(grades);
        int[] roundedGrades = gradesManager.roundedGrades(grades);
        int highestRoundedGrade = gradesManager.highestRoundedGrade(grades);
        double average = gradesManager.averageGrade(grades);
        System.out.println("Nicht ausreichende Noten: " + Arrays.toString(fail));
        System.out.println("Das Durchschnitt der Noten: " + average);
        System.out.println("Aufgerundete Noten: " + Arrays.toString(roundedGrades));
        System.out.println("Groesste aufgerundete Note: " + highestRoundedGrade);



    }
}