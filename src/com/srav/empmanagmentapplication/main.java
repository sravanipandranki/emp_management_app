package com.srav.empmanagmentapplication;
import java.util.Scanner;
public class main {
    EmployeeService service = new EmployeeService();
    static boolean ordering = true;
    public static void menu() {
        System.out.println("Welcome to Employee mangement System"
                + "\n1.add Employee"
                + "\n2.view Employee"
                + "\n3.Update Employee"
                + "\n4.delete Employee"
                + "\n5.ViewAllEmployee"
                + "\n6.Exist");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EmployeeService service = new EmployeeService();
        do {
            menu();
            System.out.println("Enter your choice");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("add employee");
                    service.addEmp();
                    break;
                case 2:
                    System.out.println("View Employee");
                    service.viewEmp();
                    break;
                case 3:
                    System.out.println("update Employee");
                    service.UpdateEmployee();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    service.deleteEmp();
                    break;
                case 5:
                    System.out.println("View all Employee");
                    service.viewEmp();
                    break;
                case 6:
                    System.out.println("thanks for using this application");
                    System.exit(0);
                default:
                    System.out.println("please enter valid inforamation");
                    break;
            }
        } while (ordering);
    }
}














