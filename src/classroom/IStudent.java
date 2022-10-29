package classroom;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IStudent extends Remote {
    String firstName() throws RemoteException;
    String lastName() throws RemoteException;
    int studentNumber() throws RemoteException;
    String displayListTests() throws RemoteException;
    void addTest(String label,double note,double coefficient) throws RemoteException;
    double calculateAverage() throws RemoteException;
}
