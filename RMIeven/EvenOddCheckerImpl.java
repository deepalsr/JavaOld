package RMIeven;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EvenOddCheckerImpl extends UnicastRemoteObject implements EvenOddChecker {
    protected EvenOddCheckerImpl() throws  RemoteException{
        super();
    }
    @Override
    public boolean isEven(int number) throws RemoteException {
        return number %2 ==0;
    }
}
