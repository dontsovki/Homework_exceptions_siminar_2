import Pacadg.Task1.GetFloat;
import Pacadg.Task2.Division;
import Pacadg.Task3.Task;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        GetFloat.getflot();
        Division.division();
        try {
            Task.div();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Task.printSum(5,5);
    }
}