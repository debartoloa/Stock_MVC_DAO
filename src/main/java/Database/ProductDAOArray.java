package Database;

import Model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOArray implements ProductDAO {
    List<Product> products;

    public ProductDAOArray() {
        this.products = new ArrayList<>();
    }

    @Override
    public void add(int id, String name, int price) {
        this.products.add(new Product(id, name, price));
    }

    @Override
    public void del(int id) {
        this.products.remove(getByID(id));
    }

    @Override
    public Product getByID(int id) {
        for (Product p : this.products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        return this.products;
    }
}
