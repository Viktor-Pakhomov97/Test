package CatCoding.ProductHW;

import java.util.Arrays;

public class ScoreTest {
    public static void main(String[] args) {
        Product[] notebook = {new Product("Asus")};
        Product[] mouse = {new Product("wireless"), new Product("wired")};
        Category category = new Category();
        category.setProducts(notebook);
        System.out.println(Arrays.toString(category.getProducts()));
Basket basket = new Basket();
basket.setButProduct(notebook);
User us = new User("Logo","qwert12345",basket);
        System.out.println(us);
    }
}
