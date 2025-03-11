package vn.edu.iuh.fit;

public class CoffeeShop {
    public static void main(String[] args) {
        Product coffee = new Product("Cà phê", 20.0);
        Product tea = new Product("Trà", 25.0);
        Product water = new Product("Nước suối", 10.0);

        Table table1 = new Table();
        table1.addProduct(coffee);
        table1.addProduct(tea);

        Table table2 = new Table();
        table2.addProduct(tea);
        table2.addProduct(water);

        double totalRevenue = table1.getPrice() + table2.getPrice();
        System.out.println("Doanh thu của quán cà phê là: " + totalRevenue);
    }
}