import classroom.IClass;
import classroom.IStudent;

import java.rmi.Naming;

public class ClientRMI {
    public static void main(String[] args) {
        try {
            IClass class1= (IClass) Naming.lookup("rmi://localhost:1099/class1");
            IStudent student1=class1.addStudent(1,"Salah Eddine","ABID");
            IStudent student2=class1.addStudent(2,"Walid","ABID");
            IStudent student3=class1.addStudent(3,"Aomar","ABID");
            student1.addTest("math",18,0.5);
            student1.addTest("physic",16,0.5);
            student2.addTest("math",14,0.5);
            student2.addTest("physic",13,0.5);
            student3.addTest("math",10,0.5);
            student3.addTest("physic",12,0.5);
            System.out.println(student1.studentNumber()+" "+student1.lastName()
                    +' '+student1.firstName()+":\n"+student1.displayListTests()+
                    student1.calculateAverage()+"\n");
            System.out.println(student2.studentNumber()+" "+student2.lastName()
                    +" "+student2.firstName()+":\n"+student2.displayListTests()+
                    student2.calculateAverage()+"\n");
            System.out.println(student3.studentNumber()+" "+student3.lastName()
                    +" "+student3.firstName()+":\n"+student3.displayListTests()+
                    student3.calculateAverage()+"\n");
            System.out.println("Class average: "+class1.calculateClassAvg());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
