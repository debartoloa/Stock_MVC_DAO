package Controller;

import Database.ProductDAOArray;
import Model.Product;
import View.ProductView;

public class ProductController {
    private ProductView view;
    private ProductDAOArray model;
    private boolean running = true;

    public ProductController(ProductView view, ProductDAOArray model) {
        this.view = view;
        this.model = model;
    }

    public void addProduct(int id, String name, int price) {
        model.add(id, name, price);
    }

    public void delProduct(int id) {
        model.del(id);
    }

    public void execChoicedMenu() {
        int id;
        String name;
        int price;

        switch (view.choicedMenu()) {
            case 1:
                for (Product p : model.getAll()) {
                    view.showProduct(p.getId(), p.getName(), p.getPrice());
                }
                break;
            case 2:
                id = view.readNewID();
                name = view.readNewName();
                price = view.readNewPrice();
                model.add(id, name, price);
                break;
            case 3:
                id = view.readDelID();
                Product tmp = model.getByID(id);
                view.showProduct(tmp.getId(), tmp.getName(), tmp.getPrice());
                view.showAlertDelMsg();
                model.del(id);
                break;
            case 0:
                view.showExitMsg();
                running = false;
                break;
        }
    }

    public boolean menu() {
        view.showMenu();
        execChoicedMenu();
        return running;
    }
}
