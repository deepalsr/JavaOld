package RMIeven;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EvenOddChecker extends Remote {
    boolean isEven(int number) throws RemoteException;
}
