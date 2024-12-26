package org.example.mini_project.vendingmachine.user;

import org.example.mini_project.vendingmachine.product.Inventory;

import java.util.Scanner;

public class Admin extends Users{
//    protected String name;
//    protected String pin;

    //name과 pin 필드를 private으로 선언하여 캡슐화
    private String name;
    private String pin;
    private Inventory inventory;
//    String name="admin";
//    String pin="VM4521";

    private static final String DEFAULT_ADMIN_NAME="VMadmin";
    private static final String DEFAULT_ADMIN_PIN="VM4521";


    public String getName() {
        return name;
    }

    public String getPin() {
        return pin;
    }

    public Admin() {
        this.name = DEFAULT_ADMIN_NAME;
        this.pin = DEFAULT_ADMIN_PIN;
        this.inventory=Inventory.getInstance();
        this.inventory.addObserver(this);
    }

//    public void changeAdminInfo(String name,String pin) throws IllegalAccessException{
//        setName(name);
//        setPin(pin);
//
//        this.name = name;
//        this.pin = pin;
//    }

    // or
    public void changeAdminInfo() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter new admin ID: ");
            String newName = scanner.nextLine();

            System.out.print("Enter new admin PIN: ");
            String newPin = scanner.nextLine();
            scanner.close();
            if (newPin != null && newPin.length() > 4) {
                this.name = newName;
                this.pin = newPin;
                System.out.println("Admin credentials successfully updated!");
            } else {
                throw new IllegalAccessException("PIN must be at least 4 characters long");
            }
        } catch (IllegalAccessException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPin(String pin) throws IllegalAccessException {

        if (pin != null && pin.length() > 4) {
            this.pin = pin;
        }
        else  {
            throw new IllegalAccessException("PIN must be at least 4 characters long");

//            try {
//                throw new IllegalAccessException("PIN must be at least 4 characters long");
//        } catch (IllegalAccessException e) {
//                throw new RuntimeException(e);
//            }
        }
    }

    public boolean login(String inputID,String inputPIN) {
        return inputID.equals(DEFAULT_ADMIN_NAME)&&inputPIN.equals(DEFAULT_ADMIN_PIN);
    }

    public void loginProcess() {
        Scanner sc=new Scanner(System.in);
        int attempts=0;
        final int MAX_ATTEMPTS=4;
        while(attempts<MAX_ATTEMPTS) {
            System.out.println("enter admin ID");
            String inputID=sc.nextLine();
            System.out.println("enter admin PIN");
            String inputPIN=sc.nextLine();
            sc.close();

            if(login(inputID,inputPIN)) {
                System.out.println("logged in !! ");
                return;
            } else {
                attempts++;
                System.out.println("failed to log in");

            }
        }
        System.out.println(" Loggin attempts exceeded.Try 5 minutes later.");
    }

    @Override
    public void update(String message) {
        System.out.println("Admin notification: "+message);
    }


    public void manageInventory(String productName,int quantity) {
        inventory.updateInventory(productName,quantity);
    }

    @Override
    public String usertype() {
       return "Admin";
    }
    //

}
