package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String itemName = "bananas";
        double itemPrice = 0.75;
        int itemQuantity = 5;

        System.out.println("You bought " + itemQuantity + " " + itemName + " for $" + (itemPrice * itemQuantity) + ".");
    }
}
