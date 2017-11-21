package jv17_05.pavliuk.lesson17.products;

import java.util.*;

public class ProductDemo {
    public static void main(String[] args) {
        Comparator<Product> byName = Comparator.comparing(Product::getName);
        Comparator<Product> byPrice = Comparator.comparing(Product::getPrice);
        Comparator<Product> byRating = Comparator.comparing(Product::getRating);
        Category electronics = new Category("Electronics", new HashSet<>(Arrays.asList(
                new Product("Mobile phone", 6543.32f, 15),
                new Product("Notebook", 16513.82f, 27),
                new Product("TV", 12842.13f, 16)
        )));
        Category furniture = new Category("Furniture", new HashSet<>(Arrays.asList(
                new Product("Table", 2120.32f, 17),
                new Product("Chair", 654.38f, 28),
                new Product("Cupboard", 2598.19f, 6)
        )));
        Category clothes = new Category("Clothes", new HashSet<>(Arrays.asList(
                new Product("Pants", 829.32f, 10),
                new Product("T-Shirt", 254.38f, 29),
                new Product("Cap", 198.19f, 8)
        )));
        System.out.println("Сортировка по цене:");
        print(byPrice, electronics, furniture, clothes);
        System.out.println("Сортировка по имени:");
        print(byName, electronics, furniture, clothes);
        System.out.println("Сортировка по рейтингу:");
        print(byRating, electronics, furniture, clothes);
    }

    public static void print(Comparator<Product> comparator, Category... categories) {
        Set<Product> set = new TreeSet<>(comparator);
        for (Category c : categories) {
            set.addAll(c.getProductSet());
        }
        for (Product p : set) {
            System.out.println(p);
        }
        System.out.println("************************************************");
    }
}
