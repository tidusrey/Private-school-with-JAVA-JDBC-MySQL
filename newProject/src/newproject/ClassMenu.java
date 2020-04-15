
package newproject;

import dao.StudentDao;
import static dao.StudentDao.getAllStudents;
import java.util.Scanner;
import model.Student;
import static newproject.mid.getconnection;


public class ClassMenu {
    public static void menu(){
      
             Scanner sc=new Scanner (System.in);
        int choiceentry;

do {
   getconnection();
    System.out.println("");
    System.out.println("Please enter");
    System.out.println("Press 1. For the lists of students"
          );
    System.out.println("Press 2. For entering a new student");
    System.out.println("Press 3. Current students in each class");
    System.out.println("Press 4. For printing out the list of our trainers or adding another");
    System.out.println("Press 5. For printing our courses or adding another");
    System.out.println("Press 6. For printing which course has each trainer inside"); 
    System.out.println("Press 7. For printing the list of assigments or adding another");
    System.out.println("Press 8. For printing the list of which assigment exist in each course");
    System.out.println("Press 9..For printing which assigment has each student");
    System.out.println("Press 10.Dates");
    System.out.println("Press 11.For terminating the programm");
    choiceentry = sc.nextInt();
    
    switch (choiceentry){
        
       
        case 1:
            System.out.println("The list of our beloved students");
            
            StudentDao.print(StudentDao.getAllStudents());
            break;
            
        case 2 :
            
            String fName;
            String lName;
            String dates;
            int fees;
            System.out.println("Insert the first name of the new Student");
            fName=sc.next();
            
            System.out.println("Insert the Last name of the new student");
            lName=sc.next();
            
            System.out.println("insert the date of birth of the new student");
            dates=sc.next();
            
            System.out.println("insert the fees");
            fees=sc.nextInt();
            
            
            Student str=new Student(fName,lName,dates,fees);
            
            
            
            StudentDao.insertStudent(str);
            
    }
        
    } while (choiceentry != 11);
}
}