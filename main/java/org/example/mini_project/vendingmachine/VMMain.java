package org.example.mini_project.vendingmachine;

import org.example.mini_project.vendingmachine.machine.VM;
import org.example.mini_project.vendingmachine.payment.Cash;
import org.example.mini_project.vendingmachine.product.Chips;
import org.example.mini_project.vendingmachine.product.Drinks;
import org.example.mini_project.vendingmachine.product.Inventory;
import org.example.mini_project.vendingmachine.product.Products;
import org.example.mini_project.vendingmachine.user.Admin;

import java.util.Scanner;

public class VMMain {
    public static void main(String[] args) {
   //     Admin admin = new Admin();
     //   admin.loginProcess();
//        System.out.println(admin.getName());
    //    System.out.println( admin.usertype());


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter new admin ID: ");
//        String newId = scanner.nextLine();
//        System.out.println("Enter new admin PIN: ");
//        String newPin = scanner.nextLine();
//        try {
//            admin.changeAdminInfo("administrator","admin4321");
//            System.out.println("successfully, ID and PIN changed!!!");
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }

//        admin.changeAdminInfo();


 //pick a product and check change in cash
        VM vm = new VM();
        vm.pickProduct();




    //managing Inventory
        Inventory inventory = Inventory.getInstance();
        Products chips = new Chips("chocoball");
        Products drinks = new Drinks("cola");
        inventory.addProduct(chips);
        inventory.addProduct(drinks);


    }
}
