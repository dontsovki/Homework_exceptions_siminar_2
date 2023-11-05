package Pacadg.Task2;

public class Division {
    public static void division() {

        int d = 0;
        double[] intArray = {2, 8, 9, 7, 9, 6, 5, 4, 3, 4};
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Catching exception: " + e);
        }
    }
}
