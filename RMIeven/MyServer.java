package RMIeven;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        try{
            EvenOddChecker checker = new EvenOddCheckerImpl();
            Registry registry = LocateRegistry.createRegistry(6969);
            registry.rebind("EvenOddChecker",checker);
            System.out.println("Server is running...");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
