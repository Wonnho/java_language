package org.example.streamprac;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//      List<Integer> overlist=numbers.stream().filter(x->x%2==0).toList();
//        System.out.println("filtered list:"+overlist);

        List<Integer> multiplelist=numbers.stream().map(x->x*2).toList();
        System.out.println("two times list:"+multiplelist);

        int sumlist=numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum of list:"+sumlist);

        long bigger5list=numbers.stream().filter(x->x>5).count();
        System.out.println(" list bigger than 5:"+bigger5list);

        List<String> fruits = new ArrayList<>(List.of("apple", "banana", "cherry", "fineapple", "apple"));
        List<String> fruit=fruits.stream().filter(x->x.length()>5).toList();
        System.out.println("fruits  greater than 5 letters "+fruit);

        List<String> upperfruit=fruits.stream().map(String::toUpperCase).toList();
        System.out.println("fruits  by upper Case "+upperfruit);

        List<String> redundantfruit=fruits.stream().distinct().sorted().toList();
        System.out.println("fruits excluding multiple fruits "+redundantfruit);

        List<Integer> sizefruit=fruits.stream().map(String::length).toList();
        System.out.println("length of fruits "+sizefruit);


        // 다


        List<Product> products;
        products = new ArrayList<>(List.of(
                new Product("notebook", 1200000, "SALE"),
                new Product("mouse", 50000, "SALE"),
                new Product("keyboard", 150000, "SOLD_OUT"),
                new Product("monitor", 350000, "SOLD_OUT"),
                new Product("speaker", 400000, "SALE")

        ));

        Stream<Product> product = products.stream();
         List<String> product2=products.stream().map(Product::getName).toList();
        System.out.println("list of product name:"+product2);

        List<String> productlist=products.stream().filter(x->x.getPrice()>=200000)
                .map(Product::getName).toList();
        System.out.println("product name worth of 200000:"+productlist);

        int productpricesum=products.stream()
                .filter(p->p.getStatus().equals("SALE"))
                .mapToInt(Product::getPrice).sum();
        System.out.println("total price of products:"+productpricesum);

        List<String> worthylist=products.stream().filter(p->p.getPrice()>=200000)
                .filter(p->p.getStatus().equals("SALE"))
                .map(Product::getName).toList();
        System.out.println("products worthy of 200000:"+worthylist);
    }
}
