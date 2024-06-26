package com.learning.java.oops;
//Inventory Tracking system

public class InventoryItem {
    //instance variables
    String itemName;
    int itemCode;
    int itemQuantity;
    int itemCost;

    public static void main(String[] args) {
        //object creation
        InventoryItem invenroryItem1;       // Object 1
        invenroryItem1 = new InventoryItem();

        invenroryItem1.itemName = "Mobile phones";
        invenroryItem1.itemCode = 4562145;
        invenroryItem1.itemQuantity = 10000;
        invenroryItem1.itemCost = 25000;
        //Display details
        System.out.println("Item Name: "+ invenroryItem1.itemName);
        System.out.println("Item Code: "+ invenroryItem1.itemCode);
        System.out.println("Item Quantity: "+ invenroryItem1.itemQuantity);
        System.out.println("Item Cost: "+ invenroryItem1.itemCost);
        System.out.println(" ");

        InventoryItem invenroryItem2;       // Object 2
        invenroryItem2 = new InventoryItem();

        invenroryItem2.itemName = "Cars";
        invenroryItem2.itemCode = 99999;
        invenroryItem2.itemQuantity = 120;
        invenroryItem2.itemCost = 5_49_999;
        //Display details
        System.out.println("Item Name: "+ invenroryItem2.itemName);
        System.out.println("Item Code: "+ invenroryItem2.itemCode);
        System.out.println("Item Quantity: "+ invenroryItem2.itemQuantity);
        System.out.println("Item Cost: "+ invenroryItem2.itemCost);


    }
}
