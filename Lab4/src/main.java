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

        System.out.println("A3: ");
        int[] x = {6,4,0,0,0,0,0,0,0};
        int[] y = {1,3,0,0,0,0,0,0,0};
        int[] sumArrays = arrayOperations.sumArrays(x, y);
        int[] diffArrays = arrayOperations.diffArrays(x, y);
        int[] multiArray = arrayOperations.multiArray(x,4);
        int[] divArray = arrayOperations.divArray(x,4);
        System.out.println("Arrays addiert: " + Arrays.toString(sumArrays));
        System.out.println("Arrays subtrahiert: " + Arrays.toString(diffArrays));
        System.out.println("Arrays multipliziert: " + Arrays.toString(multiArray));
        System.out.println("Arrays geteilt: " + Arrays.toString(divArray));

        System.out.println("A4: ");
        int[] pricesKeyboard = {40,35,70,15,45};
        int[] pricesUnit = {20,15,40,15};
        int cheapestKeyboard = electronicsBudgeting.cheapestKeyboard(pricesKeyboard);
        int mostExpensiveObject = electronicsBudgeting.mostExpensiveObject(pricesKeyboard, pricesUnit);
        int mostExpensiveAffordable = electronicsBudgeting.mostExpensiveAfforadble(pricesUnit, 25);
        int mostExpAffordableSetup = electronicsBudgeting.mostExpAffordableSetup(pricesKeyboard, pricesUnit, 70);

        System.out.println("Billigste Tastatur: " + cheapestKeyboard);
        System.out.println("Teuersten Gegenstand: " + mostExpensiveObject);
        System.out.println("Teuerste Laufwerk im Budget: " + mostExpensiveAffordable);
        System.out.println("Groesste Geldbetrag fuer Tastatur und USB im Budget: " + mostExpAffordableSetup);




    }
}