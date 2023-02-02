package com.srav.empmanagmentapplication;
import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    HashSet<Employee> empset = new HashSet<Employee>();
    Employee emp1 = new Employee(1, "Sravani", 23, "Developer", "IT", 35000);
    Employee emp2 = new Employee(2, "Chandrika", 26, "Tester", "CO", 90000);
    Employee emp3 = new Employee(3, "Priya", 21, "Tester", "CO", 45000);
    Employee emp4 = new Employee(4, "Bhaskar", 28, ".Net Developer", "CO", 58000);
    Employee emp5 = new Employee(5, "VasuDev", 21, "System Eng", "CO", 78000);
    Employee emp6 = new Employee(6, "Balu", 24, "Designer", "CO", 50000);
    Employee emp7 = new Employee(7,"aa", 24, "Designer", "CO", 50000);
    Scanner scan = new Scanner(System.in);
    boolean found = false;
    int id;
    String name;
    int age;
    String department;
    String designation;
    double sal;

    public EmployeeService() {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
        empset.add(emp5);
        empset.add(emp6);
        empset.add(emp7);
    }

    //view all employees

    public void viewAllEmps() {
        for (Employee emp : empset) {
            System.out.println(emp);
        }
    }

    //view emp based on there id

    public void viewEmp() {
        System.out.println("Enter id: ");
        id = scan.nextInt();
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee with this id is not present");
        }
    }
    //update the Employee

    public void UpdateEmployee() {
        System.out.println("Enter id: ");
        id = scan.nextInt();
        boolean found = false;
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println("Enter name: ");
                name = scan.next();
                System.out.println("Enter the new salary: ");
                sal = scan.nextDouble();
                emp.setName(name);
                emp.setSalary(sal);
                System.out.println("Update details of employee are: ");
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee is not present");
        } else {
            System.out.println("Employee details upload Successfully!!");
        }
    }
    //delete emp

    public void deleteEmp() {
        System.out.println("Enter id: ");
        id = scan.nextInt();
        boolean found = false;
        Employee empdelete = null;
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                empdelete = emp;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee is not present");
        } else {
            empset.remove(empdelete);
            System.out.println("Employee deleted Sucessfully!!");
        }
    }

    //add emp
    public void addEmp() {
        System.out.println("Enter id: ");
        id = scan.nextInt();
        System.out.println("Enter name");
        name = scan.next();
        System.out.println("Enter age");
        age = scan.nextInt();
        System.out.println("Enter the designation");
        designation = scan.next();
        System.out.println("Enter Department");
        department = scan.next();
        System.out.println("Enter the salary");
        sal = scan.nextDouble();

        Employee emp = new Employee(id, name, age, designation, department, sal);
        empset.add(emp);
        System.out.println(emp);
        System.out.println("Employee added successfully");
    }
}