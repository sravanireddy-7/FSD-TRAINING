package com.example.productdemo1;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductDAO dao = new ProductDAO();

        while (true) {

            System.out.println("\n===== PRODUCT MANAGEMENT =====");
            System.out.println("1. Insert Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Product Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Product Price: ");
                double price = sc.nextDouble();

                Product p = new Product(id, name, price);
                dao.save(p);

                System.out.println("Product Inserted Successfully");
                break;

            case 2:
                List<Product> products = dao.findAll();

                System.out.println("\nProducts List:");
                for (Product prod : products) {
                    System.out.println(prod);
                }
                break;

            case 3:
                System.out.print("Enter Product ID to Update: ");
                int uid = sc.nextInt();

                Product up = dao.findById(uid);

                if (up != null) {

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Price: ");
                    double newPrice = sc.nextDouble();

                    up.setName(newName);
                    up.setPrice(newPrice);

                    dao.update(up);

                    System.out.println("Product Updated Successfully");
                } else {
                    System.out.println("Product Not Found");
                }
                break;

            case 4:
                System.out.print("Enter Product ID to Delete: ");
                int did = sc.nextInt();

                dao.delete(did);

                System.out.println("Product Deleted Successfully");
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