package labs.pm.app;

import labs.pm.data.Product;
import labs.pm.data.Rating;

import java.math.BigDecimal;

public class Shop {

    public static void main(String[] args) {
        int id = 0;

        Product p1 = new Product(++id, "Tea", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        Product p2 = new Product(++id, "Coffee", BigDecimal.valueOf(2.99));
        Product p3 = new Product();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }

}
