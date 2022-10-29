package classroom;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IClass extends Remote {
    IStudent addStudent(int studentNumber,String firstName,String lastName) throws RemoteException;
    IStudent getStudentByNumber(int studentNumber) throws RemoteException;
    double calculateClassAvg() throws RemoteException;
}
