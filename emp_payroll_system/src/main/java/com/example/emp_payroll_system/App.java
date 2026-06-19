package com.example.emp_payroll_system;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {

            System.out.println("\n=====Employeee Payroll System=====");
            System.out.println("1. Insert Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Employee department: ");
                String department = sc.nextLine();
                
                System.out.print("Enter Employee Salary: ");
                double salary = sc.nextDouble();
                
                sc.nextLine();
                System.out.print("Enter Employee's Joiningdate: ");
                String joiningdate = sc.nextLine();

                Employee e = new Employee(id, name, department, salary, joiningdate);
                dao.save(e);

                System.out.println("Employee Inserted Successfully");
                break;

            case 2:
                List<Employee> employees = dao.findAll();

                System.out.println("\nEmployee List:");
                for (Employee emp : employees) {
                    System.out.println(emp);
                }
                break;

            case 3:
                System.out.print("Enter Employee ID to Update: ");
                int uid = sc.nextInt();

                Employee up = dao.findById(uid);

                if (up != null) {

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Department: ");
                    String newDepartment = sc.nextLine();
                    
                    System.out.print("Enter New Salary: ");
                    double newSalary = sc.nextInt();
                    
                    System.out.print("Enter New Joiningdate: ");
                    String newJoiningdate = sc.nextLine();
                    
                    up.setName(newName);
                    up.setDepartment(newDepartment);
                    up.setSalary(newSalary);
                    up.setJoiningdate(newJoiningdate);

                    dao.update(up);

                    System.out.println("Employee Updated Successfully");
                } else {
                    System.out.println("Employee Not Found");
                }
                break;

            case 4:
                System.out.print("Enter Employee ID to Delete: ");
                int did = sc.nextInt();

                dao.delete(did);

                System.out.println(" Deleted Successfully");
                break;

            case 5:
                System.out.println("Thank You!");
                sc.close();
                System.exit(0);

            default:
                System.out.println("Invalid Choice");
            }
        }
    }
}
