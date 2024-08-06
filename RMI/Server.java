package RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws RemoteException {
        try {
            Sum addi = new Sumimp();
            Registry registry = LocateRegistry.createRegistry(6969);
            registry.rebind("Sum",addi);

        }catch (RemoteException e){
            throw new RuntimeException(e);
        }
    }
}
