package View;

import Model.Product;

import java.util.Scanner;

public class ProductView {

    public void showMenu() {
        System.out.println("*** MENU");
        System.out.println("");
        System.out.println("1. List all products");
        System.out.println("2. Add a new product");
        System.out.println("3. Del a product");
        System.out.println("0. EXIT");
    }

    public int choicedMenu() {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }

    public void showProduct(int id, String name, int price) {
        System.out.println("----- PRODUCT -----");
        System.out.println("ID: " + id);
        System.out.println("NAME: " + name);
        System.out.println("PRICE: " + price);
    }

    public void showExitMsg() {
        System.out.println("Exiting ......");
    }

    public int readNewID() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("ID: ");
        return keyboard.nextInt();
    }

    public String readNewName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Name: ");
        return keyboard.nextLine();
    }

    public int readNewPrice() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Price: ");
        return keyboard.nextInt();
    }

    public int readDelID() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("ID to Delete: ");
        return keyboard.nextInt();
    }

    public void showAlertDelMsg() {
        System.out.println("*** DELETING ...");
    }
}
