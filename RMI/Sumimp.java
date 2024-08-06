package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Sumimp extends UnicastRemoteObject implements Sum {
    protected Sumimp() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a+b;
    }
}
