package com.example.studentinfo;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\n=====Student Management=====");
            System.out.println("1. Insert Students");
            System.out.println("2. Display All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Student Email: ");
                String email = sc.nextLine();
                
                System.out.print("Enter Student Course: ");
                String course = sc.nextLine();
                
                System.out.print("Enter Student Age: ");
                int age = sc.nextInt();

                Student s = new Student(id, name, email, course, age);
                dao.save(s);

                System.out.println("Student Inserted Successfully");
                break;

            case 2:
                List<Student> students = dao.findAll();

                System.out.println("\nStudents List:");
                for (Student stud : students) {
                    System.out.println(stud);
                }
                break;

            case 3:
                System.out.print("Enter Student ID to Update: ");
                int uid = sc.nextInt();

                Student up = dao.findById(uid);

                if (up != null) {

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Email: ");
                    String newEmail = sc.nextLine();
                    
                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();
                    
                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();
                    
                    up.setName(newName);
                    up.setEmail(newEmail);
                    up.setCourse(newCourse);
                    up.setAge(newAge);

                    dao.update(up);

                    System.out.println("Student Updated Successfully");
                } else {
                    System.out.println("Student Not Found");
                }
                break;

            case 4:
                System.out.print("Enter Student ID to Delete: ");
                int did = sc.nextInt();

                dao.delete(did);

                System.out.println("Student Deleted Successfully");
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
