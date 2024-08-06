package RMIeven;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry("localhost",6969);
            EvenOddChecker checker = (EvenOddChecker)registry.lookup("EvenOddChecker");

            int number =10;
            boolean isEven = checker.isEven(number);

            System.out.println("The number is "+(isEven ? "even":"odd"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
