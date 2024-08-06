package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry("localhost",6969);
            Sum addi = (Sum)registry.lookup("Sum");
            int a= 10;
            int b=12;
            int result = addi.add(a,b);
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
