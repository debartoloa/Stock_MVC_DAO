package Database;

import Model.Product;
import java.util.List;

public interface ProductDAO {
    public void add(int id, String name, int price);
    public void del(int id);
    public Product getByID(int id);
    public List<Product> getAll();
}
