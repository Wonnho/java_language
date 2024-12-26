package org.example.mini_project.vendingmachine.product;

public abstract class Products {      // not allowed to instantiate
    private String name;
    private int productprice;
    private int productInv;

    public Products(String name, int productprice, int productInv) {
        this.name = name;
        this.productprice = productprice;
        this.productInv = productInv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductprice() {
        return productprice;
    }

    public void setProductprice(int productprice) {
        this.productprice = productprice;
    }

    public int getProductInv() {
        return productInv;
    }

    public void setProductInv(int productInv) {
        this.productInv = productInv;
    }

    public void updateStock(int quantity) {
        this.productInv +=quantity;
    }


    public void decreaseProductInv() {
        if(productInv>0) {
            productInv--;
        }
    }
}
