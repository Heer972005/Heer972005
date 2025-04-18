/*Write a java program to display the employee details using the Scanner class.*/
import java.util.*;
public class Experiment_3{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int empId=0;
        double sal=0.0;
        String name="",depart="";
        //Employee ID
        try {
            System.out.print("Enter Employee ID (number): ");
            empId=s.nextInt();
            s.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("Invalid Employee ID! It should be a number.");
            return;
        }
        //Employee Name
        while (true) {
            System.out.print("Enter Employee Name: ");
            name=s.nextLine();
            if (name.matches("[a-zA-Z ]+")) { 
                break;
            } else {
                System.out.println("Invalid Name! Please enter only letters and spaces.");
            }
        }
        //Department
        while (true) {
            System.out.print("Enter Department: ");
            depart=s.nextLine();
            if (depart.matches("[a-zA-Z ]+")) { 
                break;
            } else {
                System.out.println("Invalid Department! Please enter only letters and spaces.");
            }
        }
        //Salary
        try {
            System.out.print("Enter Salary: ");
            sal=s.nextDouble();
        } catch(InputMismatchException e) {
            System.out.println("❌ Invalid Salary! It should be a number (e.g., 50000.00).");
            return;
        }

        // Display employee details
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Name          : " + name);
        System.out.println("Department    : " + depart);
        System.out.println("Salary        : ₹" + sal);
    }
}





/*
 thread-light weight process which shares resources of given process 
 two ways of creating thread-
 1)sub-class of thread class-
2)by implementing runnaable
 */