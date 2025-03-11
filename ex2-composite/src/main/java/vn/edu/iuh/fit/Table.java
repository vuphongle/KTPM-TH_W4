package vn.edu.iuh.fit;

import java.util.ArrayList;
import java.util.List;

public class Table implements Component{
    private List<Component> products = new ArrayList<>();

    public void addProduct(Component product) {
        products.add(product);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Component product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
