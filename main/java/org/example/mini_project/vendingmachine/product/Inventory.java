package org.example.mini_project.vendingmachine.product;

import org.example.mini_project.vendingmachine.user.Users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private int sales;
//    private int productprice;
    private static Inventory instance;


    private Map<String,Products> products;
    private List<Users> observers;

    public Inventory() {
        products=new HashMap<>();
        observers=new ArrayList<>();
        sales=0;
    }

    public static Inventory getInstance() {
        if(instance==null) {
            instance=new Inventory();
        }
        return instance;
    }

public void addProduct(Products product) {
        if(product!=null) {
            products.put(product.getName(), product);
            notifyObservers("New product added" + product.getName());
        }
}


public void addObserver(Users observer) {
    observers.add(observer);
}

private void notifyObservers(String message)

    {
for(Users observer:observers){
    observer.update(message);
}
}
//재고관리;재고관리는 관리자가 하게 된다. 그 기능을 관리자, Admin에서 구현해 보자

    public void updateInventory(String productName,int quantity) {
        Products product=products.get(productName);
        if(product!=null) {
            product.updateStock(quantity);// create updateStock at Product
            notifyObservers("stock updated for "+productName);
        }
    }

    //notify change in sales to observer and record it

    public boolean salesChange(String productName) {
        Products product=products.get(productName);
        if(product!=null&&product.getProductInv()>0) {
                product.decreaseProductInv();
                sales+=product.getProductprice();
                notifyObservers("Product sold: "+productName);
                return  true;
        }
        return false;
    }

}
