import Controller.ProductController;
import Database.ProductDAOArray;
import View.ProductView;

import java.util.Scanner;

public class App {
    ProductDAOArray productDAOArray = new ProductDAOArray();
    ProductView productView = new ProductView();
    ProductController productController = new ProductController(productView, productDAOArray);

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public App() {

    }

    public void run() {
        boolean running = true;
        while (running) {
            running = productController.menu();
        }
    }
}
